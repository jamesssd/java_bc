import java.util.Scanner;

//import Scanner

public class Chatbot {
    public static void main(String[] args) {
        String input, home, language;
        int age;
        //set up scanner. 
        Scanner name = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        input = name.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi " + input + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        home = name.nextLine();

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        age = name.nextInt();


        //add new a line before asking next question.
        System.out.println("So you're " +age + ", cool! I'm 400 years old.");
        int difference  = 400/age;
        System.out.println("This means I'm " + difference + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it.
        name.nextLine(); 
        language = name.nextLine();
        //add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        name.close();
        //close scanner. 

        
    }
}
