package Section4;

public class ReturnValues {
    public static void main(String[] args) {
       double measure1=  measureRectangle(10.6, 15.4, "area");
       double measure2= measureRectangle(3.2, 4.1, "perimeter");
      

       stringPrinter(4.3, 2.2, measure1, "area");
       stringPrinter(3.2, 4.1, measure2, "perimeter");
    

       
    }

    public static double measureRectangle(double len, double wid, String option){
        if(len < 0 || wid < 0){
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }
        switch(option){
            case "area":
            return len * wid;
            case "perimeter": return 2*(len + wid)
            default: return 404;
        }    
    }

    public static void stringPrinter(double len, double wid, double measure, String option){
        System.out.println("The " + option + " of a rectangle with length  " + len + " and width " + wid + " is equal to " + area + "\n");
    }
}

    