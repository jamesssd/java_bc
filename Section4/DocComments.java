package Section4;

public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside function: 
     *  1. prints hi
     */
    public static void greet(){
        System.out.println("hi!");
    }

    /**
     * Function name: printText
     * 
     * @param name (string)
     * @param age (string)
     * 
     * Inside function:
     *  1. Prints name and age
     */
    public static void printText(String name, String age){
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * @param length double
     * @param width double
     * @return area double
     * 
     * Inside the function:
     * 1. Calculate the area and returns it
     */
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}
