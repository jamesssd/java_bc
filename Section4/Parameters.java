package Section4;

public class Parameters {
    public static void main(String[] args) {
        measureRectangle(10.6, 15.4);
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
        measureRectangle(1.6, 5.6);
        measureRectangle(10.1, 0.7);
    }

    public static void measureRectangle(double len, double wid){
        double area = len * wid;
        System.out.println("The area of the rectangle with the length of  " + len  + " and width" + wid + " is eqal to "  +  area + "\n");
    }


}
