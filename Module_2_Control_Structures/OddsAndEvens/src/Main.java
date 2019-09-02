import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Clumps all code together

    public static void main(String[] args) {
        // write your code here
        Scanner INPUT = new Scanner(System.in);
        //Greet
        System.out.println("Let's play a game called \"Odds and Evens\"");
        //Take in player's name
        System.out.print("What is your name? ");
        String name = INPUT.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String playerSide = (INPUT.next()).toLowerCase();
        //Validate player input and change make input consistent
        boolean done = false;
        while (!done) {
            if (playerSide.equals("e") || playerSide.equals("evens")) {
                System.out.println(name + " has picked evens! The computer will be odds.");
                playerSide = "e";
                done = true;
            } else if (playerSide.equals("o") || playerSide.equals("odds")) {
                System.out.println(name + " has picked odds! The computer will be evens.");
                playerSide = "o";
                done = true;
            } else {
                System.out.print("Sorry but you type the invalid letter(s) \n TYPE odds or " +
                        "o for odds, evens or e for evens *CASE INSENSITIVE*: ");
                playerSide = (INPUT.next()).toLowerCase();
            }
        }
        System.out.println("-----------------"); //separator

        //actualPlayGamePart
        // ask the number of "fingers" for player and set up for computer
        System.out.print("How many \"fingers\" do you put out? ");
        int playerValue = INPUT.nextInt();
        while (playerValue > 6) {
            System.out.print("You do not have more than 5 fingers in one hand -_-!" +
                    "\n pls type a valid input");
            playerValue = INPUT.nextInt();
        }
        //randomize
        //takes in the number of "fingers" the player would like to play, and uses
        //the random generator to decide what the computer will play
        Random random = new Random();
        int computerValue = random.nextInt(6);
        System.out.println("The Computer plays " + computerValue + " \"fingers\" ");
        System.out.println("-----------------"); //separator
        //Determine result
        //adds the 2 integers together and produces the sum
        int sum = playerValue + computerValue;
        boolean result = sum % 2 == 0; // true if evens false otherwise
        System.out.println(playerValue + " + " + computerValue + " = " + sum);
        System.out.print(sum + " is ...");
        //who wins
        String type = "";
        if (result) {
            System.out.println("even!");
            type = "e";
        } else {
            System.out.println("odd!");
            type = "o";
        }
        //decided whether the final answer is even or odd, and declare the winner.
        if (type.equals(playerSide)) {
            System.out.println("That means " + name + " wins! :)");
        } else {
            System.out.println("That means computer wins! ^_^ ");
        }
        System.out.println("-----------------"); //separator
    }
}
