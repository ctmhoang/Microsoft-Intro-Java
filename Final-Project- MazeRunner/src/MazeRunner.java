import java.util.Scanner;

public class MazeRunner {
    private final static Maze myMap = new Maze();
    public final static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        int movesMade = 0;
        intro();
        while (!myMap.didIWin()) {
            movesMade = userMover(movesMade);
            moveMessage(movesMade);
        }

    }

    public static void intro() {
        // Welcome user to the program and print the new map
        System.out.println("Welcome to Maze Runner! \n Here is your current position:");
        myMap.printMap();
        System.out.println("------------------------------------------------");

    }

    public static int userMover(int movesMade) {
    /*Ask the users which direction they would like to move
    Continuously ask the users select valid and possible direction*/
        System.out.println("Where would you like to move? (R, L, U, D)");
        String direction = INPUT.next().toUpperCase();
        while (!(direction.equalsIgnoreCase("R") || direction.equalsIgnoreCase("L") || direction.equalsIgnoreCase("U") || direction.equalsIgnoreCase("D"))) {
            System.out.println("Please type in a valid input !");
            direction = INPUT.next().toUpperCase();
        }
        if (myMap.isThereAPit(direction)) {
            navigatorPit(direction);
        } else if (myMap.canIMoveRight() && direction.equalsIgnoreCase("R")) {
            myMap.moveRight();
        } else if (myMap.canIMoveLeft() && direction.equalsIgnoreCase("L")) {
            myMap.moveLeft();
        } else if (myMap.canIMoveUp() && direction.equalsIgnoreCase("U")) {
            myMap.moveUp();
        } else if (myMap.canIMoveDown() && direction.equalsIgnoreCase("D")) {
            myMap.moveDown();
        } else {
            System.out.println("Sorry you've hit a wall.");
        }
        movesMade++;
        myMap.printMap();

        return movesMade;

    }

    public static void moveMessage(int movesMade) {
        //Take in number of moves user made
        //print statements when user hit  certain milestones within move count
        //After 100, tells them out of move and close program
        //If user completes the games within 100 moves, add the number of moves it took to the congratulatory statement
        switch (movesMade) {
            case 50:
                System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
                break;
            case 75:
                System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
                break;
            case 90:
                System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
                break;
            case 100:
                System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
                break;
        }
        if (movesMade <= 100 && myMap.didIWin()) {
            System.out.println(" Congratulations, you made it out alive! \n" +
                    "and you did it in " + movesMade + " moves");
        } else if (movesMade > 100) {
            System.out.println("Sorry, but you didn't escape in time- you lose!");
        }

    }

    public static void navigatorPit(String direction) {
        //return false if a  wall or true if a pit
        // if pit give a option to jump over
        System.out.println("Watch out! There's a pit ahead, jump it?");
        String ans = INPUT.next().toLowerCase();
        while (!(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("yup") || ans.equalsIgnoreCase("nah") || ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no"))) {
            ans = INPUT.next();
        }
        if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("yup")) {
            myMap.jumpOverPit(direction);
        } else {
            System.out.println("How dare you scare -_-");
        }
        if (direction.equalsIgnoreCase("L")) {
            myMap.moveLeft();
        } else if (direction.equalsIgnoreCase("R")) {
            myMap.moveRight();
        } else if (direction.equalsIgnoreCase("U")) {
            myMap.moveUp();
        } else if (direction.equalsIgnoreCase("D")) {
            myMap.moveDown();
        }
    }

}
