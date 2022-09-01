import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        double [] newPrice = new double[4];

        newPrice[0] = price[0] * .13 + price[0];
        newPrice[1] = price[1] * .13 + price[1];
        newPrice[2] = price[2] * .13 + price[2];
        newPrice[3] = price[3] * .13 + price[3];

        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(newPrice));
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */

         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */

         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */

    }
}
