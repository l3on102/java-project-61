package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.Game;



public class Prime implements Game {

    final int lowRangeValue = 1;
    final int highRangeValue = 20;

    @Override
    public String getRules() {
        //System.out.println("What is the result of the expression?");
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getGameData() {
        //int lowRangeValue = 1;
        //int highRangeValue = 20;
        String[] gameData = new String[2];
        //double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        //int num = (int) num1Double;
        int num = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(num);
        gameData[1] = isPrime(num);
        /*if (num < 2) {
            gameData[1] = "no";
        }
        if (num == 2) {
            gameData[1] = "yes";
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                gameData[1] = "no";
                break;
        }   else {gameData[1] = "yes";
            }
        }*/
        //System.out.println(Arrays.toString(gameData));
        return gameData;
    }

    private String isPrime(int num) {

         String answer = "";

        if (num < 2) {
            answer = "no";
        }
        if (num == 2) {
            answer = "yes";
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = "no";
                break;
        }   else {answer = "yes";
            }
        }
        return answer;
    }


}
