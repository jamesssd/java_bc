public class Exams {
    public static void main(String[] args) {
        
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        //Task 1: Create an array that stores 5 students: "Harry", "Neville", "Ron", "Hermione", "Seamus"

        //Task 2: Assign each student a seat according to their index in the array.
        //           print: " <student at index 0> ", you will take seat 0. 
        String[] students = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

        String seat0 = "Harry"; 
        String seat1 = "Neville"; 
        String seat2 = "Ron"; 
        String seat3 = "Hermione"; 
        String seat4 = "Seamus"; 

        System.out.println(seat0 + " you will take seat 0.");
        System.out.println(seat1 + " you will take seat 1.");
        System.out.println(seat2 + " you will take seat 2.");
        System.out.println(seat3 + " you will take seat 3.");
        System.out.println(seat4 + " you will take seat 4.");
    }
}