package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.Game;

public class Calculator implements Game {
    final int lowRangeValue = 1;
    final int highRangeValue = 20;
    final int lowRangeOperators = 1;
    final int highRangeOperators = 3;
    String[] arithmeticOperators = {"/", "+", "-", "*"};
    public String getRules() {
        return "What is the result of the expression?calc";
    }
    public String[] getGameData() {
        String[] gameData = new String[2];
        int result = 0;
        int num1 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int num2 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int random = Utils.getRandomNumber(lowRangeOperators, highRangeOperators);
        String operator = arithmeticOperators[random];

        gameData[0] = num1 + " " + operator + " " + num2;

        switch (operator) {
            case "+":
                result  = num1 + num2;
                break;
            case "-":
                result  = num1 - num2;
                break;
            case "*":
                result  = num1 * num2;
                break;
        }
        gameData[1] = Integer.toString(result);
        return gameData;
    }
}

