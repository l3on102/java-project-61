package hexlet.code;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static final int GAMEROUNDS = 3;
    public static void start(Game game) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getRules());
        int countI = 0;
        while (countI < GAMEROUNDS) {
            String[] gameData = new String[2];
            gameData = game.getGameData();
            String questionFromGame = gameData[0];
            String answerFromGame = gameData[1];
            System.out.println("Question: " + questionFromGame);
            System.out.print("Your answer: ");
            String answerFromPlayer = "";
            answerFromPlayer = scanner.next();
            if (answerFromPlayer.equals(answerFromGame)) {
                System.out.println("Correct!");
                countI++;
            } else {
                System.out.println("'" + answerFromPlayer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + answerFromGame + "'" + "." + "\n Let's try again, " + userName + "!");
                break;
            }
        }
        if (countI == GAMEROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}

