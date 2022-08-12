import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLet's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String answer = scan.nextLine();

        if(answer.equals("yes")){
            System.out.println("Great!");
            System.out.println("Rock - Paper - Scissors - shoot!");
            String yourChoice = scan.nextLine();
            
            String computerChoice = computerChoice();
            String result= result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else{
            System.out.println("Darn, some other time...");
        }              

        scan.close();
    }

    public static String computerChoice(){
        int randomNum = (int)(Math.random() * 3); //returns a number between 0-3
    

        switch(randomNum){
            case 0: return "rock";
            case 1: return "paper";
            case 2: System.out.println("scissors");
            default: return "";
        }
        
        
    }

    public static String result(String yourChoice, String computerChoice){
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        }   else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        }  else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        }  
        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chosea: " + computerChoice);
        System.out.println(result);
    }

}
