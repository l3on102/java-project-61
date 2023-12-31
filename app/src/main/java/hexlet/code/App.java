package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Cli;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int CLI = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - CLI");
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
                break;
            case CLI:
                Cli.greet();
                break;
            case EVEN:
                Engine.start(new Even());
                break;
            case CALC:
                Engine.start(new Calculator());
                break;
            case GCD:
                Engine.start(new Gcd());
                break;
            case PROGRESSION:
                Engine.start(new Progression());
                break;
            case PRIME:
                Engine.start(new Prime());
                break;
            default:
                System.out.println("Something was broke in App");
                break;
        }
        scanner.close();
    }
}
