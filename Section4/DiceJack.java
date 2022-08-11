package Section4;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1= rollDice();
        int roll2= rollDice();
        int roll3= rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1. Shutting down");
            System.exit(0);
        }
        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Number cannot be greater than 6.");
            System.exit(0);
        }

        int sumOfNum = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNum + ".");
       
        if(checkWin(sumDiceRolls, sumOfNum)){
            System.out.println("Congrats you win!");
        } else{
            System.out.println("Sorry! You lose!");
        }
        scan.close();

       
    }

    public static int rollDice(){
        double randomNum = Math.random() * 6;
        randomNum += 1;
        return (int)randomNum;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNum){
        return (sumDiceRolls > sumOfNum && sumOfNum - sumDiceRolls < 3){
            System.out.println("Congrats! You win");
        } 
    }


}
