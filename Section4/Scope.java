package Section4;

public class Scope {

    static int dogs = 54;
    public static void main(String[] args) {
        System.out.println(dogs);
        something();
    }

    public static void something(){
        
        System.out.println(dogs);
    }
}
