import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza toppings do you want?");
        int input = scan.nextInt(); scan.nextLine();

        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        String[] toppings = new String[input];
        // Task 2 – Create the array here
        System.out.println("Great! enter each topping!");
        
        for(int i = 0; i < toppings.length; i++){
            System.out.print(i+ ". ");
            String Input = scan.nextLine();
            toppings[i] = Input;
            
        }
        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */
        System.out.println("\nThank you! Here are the toppings your ordered");
        for(int i = 0; i<toppings.length; i++){
            System.out.println(i+". " + toppings[i]);
        }

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}
