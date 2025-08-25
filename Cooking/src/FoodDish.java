//The FoodDish class implements the Cooking interface.
public abstract class FoodDish implements Cooking{
        //Attributes
        protected boolean start;
        protected String dishName;
        protected String ingredients;
        protected int cookingTime;


    //Overload the constructor with parameters.
    public FoodDish (boolean start, String dishName, String ingredients, int cookingTime) {
        this.start = start;
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }


    //The code from lines 20-58 is the getter and setter methods.
    public boolean getStart()
    {
        return start;
    }

    public void setStart(boolean start)
    {
        this.start = start;
    }

    public String getDishName()
    {
        return dishName;
    }

    public void setDishName(String dishName)
    {
        this.dishName = dishName;
    }

    public String getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(String ingredients)
    {
        this.ingredients = ingredients;
    }

    public int getCookingTime()
    {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime)
    {
        this.cookingTime = cookingTime;
    }

      //Method one: Calculating how long a dish should cook for.
      public int calculateCookingTime()
      {
        return cookingTime = 30;
      }

      //Method two: seeing if the user is ready to cook.
    public boolean startCooking(){
        return this.start = false;
    }

    //Printing out a toString.
    @Override
    public String toString()
    {
        return "FoodDish [start = "+ start + " dishName = " + dishName + ", ingredients = " + ingredients + ", " +
                "cookTime = " + cookingTime + "]";
    }
}
