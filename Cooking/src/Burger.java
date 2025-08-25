import java.util.Scanner;

//The burger class (subclass) extends to FoodDish (superclass).
public class Burger extends FoodDish{
    //Additional attributes to describe burger
    int numberPatty;
    int sliceCheese;
    int totalCheese;

    //Overloading the constructor
    public Burger(boolean start, String dishName, String ingredients, int cookingTime, int numberPatty, int sliceCheese,
                  int totalCheese)
    {
        //calling fields from the superclass.
        super(start, dishName, ingredients, cookingTime);
        //Assignment statements: The addition variables are set to the parameter values.
        this.numberPatty = numberPatty;
        this.sliceCheese = sliceCheese;
        this.totalCheese = totalCheese;
    }

    //Lines 23 through 51 represent the getter and setter methods for the class.
   public int getNumberPatty()
   {
       return numberPatty;
   }

    public void setNumberPatty(int numberPatty)
    {
        this.numberPatty = numberPatty;
    }

    public int getSliceCheese()
    {
        return sliceCheese;
    }

    public void setSliceCheese(int sliceCheese)
    {
        this.sliceCheese = sliceCheese;
    }

    public int getTotalCheese()
    {
        return totalCheese;
    }

    public void setTotalCheese(int totalCheese)
    {
        this.totalCheese = totalCheese;
    }

    //Following 54-74 are Method overrides:Specific behavior based class Returning a sentence.
    @Override
    public String prepareDish()
    {
        return "You are preparing " + this.getDishName() + " with " + getIngredients() + " ingredients from your kitchen. "
                + "You asked for " + getTotalCheese() + " slices of cheese on it.";
    }

    @Override
    public String cook(){
        return "The " + getDishName() + "(s) is (are) currently cooking.";
    }

    @Override
    public String serveDish() {
        return "Bring the " + getDishName() + " (s) to the table. It is ready to be served.";
    }

    @Override
    public String dishComplete() {
        return "That was delicious! Let's put away the extra " + getIngredients() + ".";
    }

    //Override method from parent class: calculation method.
    @Override
    public int calculateCookingTime() {
        //Checks if numberPatty equals 1,2,3 returning.
        if (this.numberPatty == 1) {
            //The number of patties * the time the patty takes to cook.
            return getNumberPatty() * 3;
        }
        else if (this.numberPatty == 2) {
            return getNumberPatty() * 3;
        }
        return 0;
    }

    //Override method to set the value to true.
    @Override
    public boolean startCooking() {
        return this.start = true;
    }

    //Get user input to set the total number of cheese. Return value: int
    public void cheese(){
        Scanner c = new Scanner(System.in);
        int topping = c.nextInt();
        this.sliceCheese = topping;
        //Checks if the condition is true
        if (sliceCheese == 1) {
            //sliceCheese is stored in total cheese, can be used in the main method output.
             this.totalCheese = this.sliceCheese;
        }
        else if(sliceCheese == 2){
             this.totalCheese = this.sliceCheese;
        }
        else if(sliceCheese == 3){
            this.totalCheese = this.sliceCheese;
        }

    }

    //Printing out a toString, each element will be displayed to the console when called.
    @Override
    public String toString()
    {
        return "FoodDish [start = " + getStart() + ", dishName = " + getDishName() + ", ingredients = " +
                getIngredients() + ", cookTime = " + getCookingTime() +  ", number of patty = " + getNumberPatty() +
                ", number of cheese slices = " + getSliceCheese() + ", the total cheese slices = " + getTotalCheese() +
                "]";
    }
}
