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
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();
                
                if(budget >= 10000){
                    System.out.println("\nGreat! A Nissan Altima is available.");
                    
                    System.out.println("\nDo you have insurance? 'Yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a drivers license? 'Yes' or 'no'");
                    String driversLicense = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int credit = scan.nextInt();

                    if(insurance.equals("yes") && driversLicense.equals("yes") && credit > 660){
                        System.out.println("\nSold! Pleasure doing business with you");
                    } else{
                        System.out.println("\nWere sorry! Youre not eligible!");
                    }
                } else{
                    System.out.println("\nWe do not sell car under 10000");
                }
            break;
            case "b": System.out.println("\nYou chose option:" + option);
                System.out.println("\nWhat is your car values at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();
                
                if(value > price && price < 30000){
                    System.out.println("\nWe will buy your car! Pleasure doing business with you!");
                } else{
                    System.out.println("\nSorry! We're not interested.");
                }
            break;

            default: System.out.println("\nInvalid option");
        }
        scan.close();

    }
}
