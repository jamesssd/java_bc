package Section3;

import java.util.Scanner;


public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" -Select option 'a' to buy a car");
        System.out.println(" -Select option 'b' to sell a car");
        
        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                
                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available.");
                    
                    System.out.println("\nDo you have insurance? 'Yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a drivers license? 'Yes' or 'no'");
                    String driversLicense = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int credit = scan.nextInt();

                    if(insurance.equals("yes") && driversLicense.equals("yes") && credit > 660){
                        System.out.println("Sold! Pleasure doing business with you");
                    } else{
                        System.out.println("Were sorry! Youre not eligible!");
                    }
                } else{
                    System.out.println("We do not sell car under 10000");
                }
            break;
            case "b": System.out.println("You chose option:" + option);
            break;

            default: System.out.println("Invalid option");
        }
        scan.close();

    }
}
