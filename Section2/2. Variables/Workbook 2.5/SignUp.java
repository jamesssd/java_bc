import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        
        System.out.println("What is your last name");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        Integer age = scan.nextInt();
        scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("What country do you live in?");
        String country = scan.nextLine();


        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 
        System.out.println("Your infomration:");
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\t\t First Name: " + firstName);
        System.out.println("\t\t Last Name: " + lastName);
        System.out.println("\t\t Age: " + age);
        System.out.println("\t\t City: " + city);
        System.out.println("\t\t Country: " + country);
        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
