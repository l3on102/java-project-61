package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 0;
        final int GREET = 1;
        final int EVEN = 2;
        final int CALC = 3;
        final int GCD = 4;
        final int PROGRESSION = 5;
        final int PRIME = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int userSelected = scanner.nextInt();
        System.out.println("Your choice: " + userSelected);
        System.out.println("Welcome to the Brain Games!");

        switch (userSelected) {
            case EXIT:
                System.out.println("Game over");
                scanner.close();
                break;
            case GREET:
                Greet.newUser();
                scanner.close();
                break;
            case EVEN:
                Engine.start(new Even());
                scanner.close();
                break;
            case CALC:
                Engine.start(new Calculator());
                scanner.close();
                break;
            case GCD:
                Engine.start(new Gcd());
                scanner.close();
                break;
            case PROGRESSION:
                Engine.start(new Progression());
                scanner.close();
                break;
            case PRIME:
                Engine.start(new Prime());
                scanner.close();
                break;
        }
    }
}
