package hexlet.code;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static final int gameRounds = 6;
    public static void start(Game game) {
        int countI = 0;
        String answer = "";
        //public static final int gameRounds = 3;
        String[] gameData = new String[2];
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        //game.getRules();
        System.out.println(game.getRules());
        while (countI < gameRounds) {
            //game.getGameData();
            gameData = game.getGameData();
            System.out.println("Question: " + gameData[0]);
            //System.out.println(gameData[0]);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (answer.equals(gameData[1])) {
                System.out.println("Correct!");
                countI++;
            } else {
                break;
            }
        }
        if (countI == gameRounds) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameData[1]
                    + "'" + "." + "\n Let's try again, " + userName + "!");
               //System.out.println("neCorrect!");
        }
    }


     /*public  static String getUsername() {
          return finalUserName;
     }
     public  static void setGameName(String name) {
          gameName = name;
          System.out.println(name);
     }
     public  static void getGameName() {
          System.out.println(gameName);
     }
*/
}


