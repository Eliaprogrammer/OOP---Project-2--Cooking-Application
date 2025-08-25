//Elia Schwartz, COP 3330C - 33777, May 13, 2025.

/*Programming project objective: This Project aims to teach students how to implement and use
* inheritance and polymorphism. */

/*The majority of the inputs are from the objects created returning the specific output associated with the information
 in the object parameter to the console when a method in the class is called.
*
* Lines 57, 59, 61, 88,90, 92 directly asks the user for input from the console, then adjust each method to print
*  output according to the information in the console.*/
public class HomeCooking {
    public static void main(String[] args) {
        //Instantiate objects of the subclasses
        //Burger Objects
        Burger singleBurger = new Burger(true, "Cheeseburger", "patty, American cheese, buns",
                4,1, 1, 0);

        Burger doubleBurger = new Burger(true, "Cheeseburger", "patty, Swiss cheese, buns",
                4, 2,2, 0);

        Burger tripleBurger = new Burger(false, "Cheeseburger", "patty, Cheddar cheese, buns",
                5, 3,0, 0);

        //Instantiating Pasta Object
        Pasta penneDish = new Pasta(true, "Baked Penne", "Penne pasta, salt and sauce",
                3, "Penne");
        Pasta spaghettiDish = new Pasta(false, "Spaghetti with meat balls", "Spaghetti pasta,"
                + " salt, sauce, parsley and premade meat balls", 7, "Spaghetti");

        Pasta ravioliDish = new Pasta(true, "Meat stuff Ravioli", "Ravioli pasta, salt, " +
                "beef, sauce", 11, "Ravioli");

        //An array called food with the instantiation objects in the indexes.
        FoodDish[] food = {singleBurger, doubleBurger, tripleBurger, penneDish, spaghettiDish, ravioliDish};

        //A loop that goes through each element, looping and printing the output when calling on each method.
        for(FoodDish Dish : food){
            System.out.println("Let's begin if you want to start cooking: " + Dish.startCooking());
            System.out.println(Dish.prepareDish());
            System.out.println(Dish.cook());
            System.out.println("It will take " + Dish.calculateCookingTime() + " minutes to cook.");
            System.out.println(Dish.serveDish());
            System.out.println(Dish.dishComplete());
            System.out.println(Dish.toString());
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }

        //Help to see the difference or separation between the outputs.
        System.out.println();
        System.out.println("Burger objects");

        //Updating the number of cheese slice on each type of burger.
        //Asking the user for the number of cheese slices.
        System.out.println("How many slice of cheese do you want on your single cheeseburger?");
        singleBurger.cheese();
        System.out.println("How many slice of cheese do you want on your double cheese burger?");
        doubleBurger.cheese();
        System.out.println("How many slice of cheese do you want on your triple cheese burger?");
        tripleBurger.cheese();

        //New array with just the burger objects
        FoodDish[] burger = {singleBurger, doubleBurger, tripleBurger};

        //A loop that goes through each element, looping and printing out the updated version of the
        // number of cheese slices on each type of burger.
        for(FoodDish Dish : burger){
            System.out.println("Let's begin if you want to start cooking: " + Dish.startCooking());
            System.out.println(Dish.prepareDish());
            System.out.println(Dish.cook());
            System.out.println("It will take " + Dish.calculateCookingTime() + " minutes to cook.");
            System.out.println(Dish.serveDish());
            System.out.println(Dish.dishComplete());
            System.out.println(Dish.toString());
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");

        }

        //Help to see the difference or separation between the outputs.
        System.out.println();
        System.out.println("Pasta objects");

        //Updating the ingredients with the user input.
        //Asking and obtaining the ingredients the user wants to add to the dish
        System.out.println("What ingredients do you want to add to your penne dish?: ");
        penneDish.updateIngredients();
        System.out.println("What ingredients do you want to add to your spaghetti dish?: ");
        spaghettiDish.updateIngredients();
        System.out.println("What ingredients do you want to add? ravioli:? ");
        ravioliDish.updateIngredients();

            //New array with just the pasta objects
        FoodDish[] pasta = {penneDish, spaghettiDish, ravioliDish};

        //A loop that goes through each element, looping and printing out the updated version of the
        //ingredients list.
        for(FoodDish Dish : pasta){
            System.out.println("Let's begin if you want to start cooking: " + Dish.startCooking());
            System.out.println(Dish.prepareDish());
            System.out.println(Dish.cook());
            System.out.println("It will take " + Dish.calculateCookingTime() + " minutes to cook.");
            System.out.println(Dish.serveDish());
            System.out.println(Dish.dishComplete());
            System.out.println(Dish.toString());
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }
   }
}
