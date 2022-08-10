package Section3;

import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two intergers (on the same line");
        String num = scan.nextLine();
        

        System.out.println("Enter two very big intergers (on the same line");
        String bigNum = scan.nextLine();

        System.out.println("Enter two decimals intergers (on the same line");
        String decimal = scan.nextLine();

        System.out.println("Enter two text values (on the same line");
        String str = scan.nextLine();

        scan.close();

        System.out.println("\tIntergers: " + num);
        System.out.println("\tBig Intergers: " + bigNum);
        System.out.println("\tDecimals: " + decimal);
        System.out.println("\tText: " + str);
    
    }
}
