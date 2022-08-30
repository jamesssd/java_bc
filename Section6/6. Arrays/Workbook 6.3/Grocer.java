import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        Scanner obj = new Scanner(System.in);
        
        System.out.println("\nDo you sell coffee");
        String input = obj.nextLine();

        for(int i = 0; i < aisle.length; i++){
            if(input.equals(aisle[i])){
                System.out.println("\nWe have that in aisle: " + aisle[i]);
                break; 
            }
        }


        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */
    
    }
}
