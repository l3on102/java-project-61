package hexlet.code;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static final int GAMEROUNDS = 3;
    public static void start(Game game) {
        int countI = 0;
        String answer = "";
        String[] gameData = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getRules());
        while (countI < GAMEROUNDS) {
            gameData = game.getGameData();
            System.out.println("Question: " + gameData[0]);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (answer.equals(gameData[1])) {
                System.out.println("Correct!");
                countI++;
            } else {
                break;
            }
        }
        if (countI == GAMEROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameData[1]
                    + "'" + "." + "\n Let's try again, " + userName + "!");
        }
    }
}


