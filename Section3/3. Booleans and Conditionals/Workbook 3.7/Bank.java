import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = new String("yes");
      

        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.

        String ans = scan.nextLine();
        if(ans.equals(str1)){
             //Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();
                // Task 3 - Pick up each value 
            System.out.println("\nHow many years have you worked for?");
            // Task 4 - Pick up number of years
            int years = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your name?");
            // Task 5 - Pick up the user's name
            String name = scan.nextLine();    
            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.   
            if(savings>= 10000 && debt < 5000 && years >= 2){
                System.out.println("Congratulations " + name + " You have been approved!");
            } else{
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }   

        } else {
             //Task 2 - Print this if the decision was not "yes"
        System.out.println("\nOK. Have a nice day!");

        }   

        scan.close();
    }
}