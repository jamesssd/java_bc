import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Let's play Rolling Java. Type anything to start.");
    String input = scan.nextLine();
    System.out.println("Great, here are the rules:\n ");
    System.out.println("- If you roll a 6 the game stops.\n");
    System.out.println("- If you roll a 4 nothing happens.\n"); 
    System.out.println("- Otherwise, you get 1 point.\n"); 
    System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
    String inPut = scan.nextLine();

    int score = 0;
    while(score != 6){
      System.out.println("Enter a random value\n");
      int diceRoll = rollDice();
      System.out.println("You rolled " + diceRoll + "\n");
      if(score == 6){
        System.out.println("End of game!");
        System.exit(0);
      } 
      else if(score ==4){
        System.out.println("Zero Points, Keep rolling\n");
      } 
      else{
        score++;
        System.out.println("One point! Keep rolling!\n");
      }
    }
  }
    public static int rollDice(){
      double randInt = (Math.random() * 6) + 1;
      int ranInt = (int)randInt;
      return ranInt;
    }
  }
