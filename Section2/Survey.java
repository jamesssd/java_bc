import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome! Thank you for taking the survery");
        
        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;
        
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int footAmount = scan.nextInt();
        counter++;
        
        System.out.println("\nThank you " + name + "for answering all " + counter + " questions");
        System.out.println("\nYour fast food expeses are " + (foodPrice/coffeePrice) + " times your cofee expenses.");
        System.out.println("\nWeekly, you spend $" + (coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("\nWeekly, you spend $" + (footAmount*foodPrice) + " on food");
        
        scan.close();
    }
}
