import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String input = obj.nextLine();

        //  Task 1: Set up Scanner, and pick up the user's response.  

        
        for (int i = 0; i < store.length; i++) { 
            if (input.equals(store[i]))  {
                System.out.println("\nWe have that in aisle: " + store[i]);
                break;
            }
          
        }

    }
}
