import java.util.Scanner;

//Pasta-subclass extends the parent class - FoodDish.
public class Pasta extends FoodDish{
    //Additional attribute
    String kindOfPasta;

    //Overloading the constructor.
    public Pasta(boolean start, String dishName, String ingredients, int cookingTime, String kindOfPasta)
    {
        //calling fields from the superclass.
        super(start, dishName, ingredients, cookingTime);
        //Assignment statements: the addition variable set to the addition parameter values.
        this.kindOfPasta = kindOfPasta;
    }

    //Lines 18-24 represent the getter and setter methods for the additional attribute.
    public String getKindOfPasta(){
        return kindOfPasta;
    }

    public void setKindOfPasta(String kindOfPasta){
        this.kindOfPasta = kindOfPasta;
    }

    //Lines 27-46 Override method: specifically for the Pasta class behavior.
    @Override
    public String prepareDish() {
        return "You are preparing " + getDishName() + " using the following ingredients: " + getIngredients() +
                ".";
    }

    @Override
    public String cook() {
        return "Your Italian dish: " + getDishName() + " is cooking.";
    }

    @Override
    public String serveDish() {
        return "Let's eat. Mangiamo! In Italian";
    }

    @Override
    public String dishComplete() {
        return "The meal is over, it's time to tidy up. Il pasto è finito, È ora di riordinare";
    }

    //Overriding the calculation method.
    @Override
    public int calculateCookingTime() {
        //Checks condition is equal to a particular word.
        //Return and set the cook time variable to a number for each kind of pasta.
        switch(kindOfPasta)
        {
            case "Penne":
                return this.cookingTime = 11;

            case "Spaghetti":
            return this.cookingTime = 9;

            case "Ravioli":
            return this.cookingTime = 4;
        }
        return 0;
    }

    //Override method to set the value to true.
    @Override
    public boolean startCooking() {
        return this.start = true;
    }

    //Updating the ingredients method
    //Returns a String, obtaining the original information for ingredients and the new ingredients they want to add.
    public void updateIngredients()
    {
        Scanner foodElements = new Scanner(System.in);
        String element = foodElements.nextLine();
        if(element.equals("None")){
             this.ingredients = getIngredients() + ", nothing else";
        }else {
             this.ingredients = getIngredients() + ", " + element;
        }
    }



    //Printing out a toString.
    @Override
    public String toString()
    {
        return "FoodDish [start = " + getStart() + ", dishName = " + getDishName() + ", ingredients = " +
                getIngredients() + ", cookTime = " + getCookingTime() + ", kind of pasta = " + getKindOfPasta() +"]";
    }
}
