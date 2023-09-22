package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.Game;
//import hexlet.code;

public class Even implements Game {
    final int lowRangeValue = 1;
    final int highRangeValue = 20;
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String[] getGameData() {
        String[] gameData = new String[2];
        //int lowRangeValue = 1;
        //int highRangeValue = 20;
        //double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        //int question = (int) questionDouble;
        int question = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(question);
        boolean even = Utils.isEven(question);
        /*if (question % 2 < 1) {
            gameData[1] = "yes";
        } else {
            gameData[1] = "no";
        }*/
        if (even == true) {
            gameData[1] = "yes";
        } else {
            gameData[1] = "no";
        }
        return gameData;
    }

}




