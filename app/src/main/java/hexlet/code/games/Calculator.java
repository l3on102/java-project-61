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
        //int lowRangeValue = 1;
        //int highRangeValue = 20;
        //String[] arithmeticOperators = {"/", "+", "-", "*"};
        //int lowRangeOperators = 1;
        //int highRangeOperators = 3;
        String[] gameData = new String[2];
        int result = 0;
        //double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        //int num1 = (int) num1Double;
        int num1 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        //double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
        //int num2 = (int) num2Double;
        int num2 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        //int random = (int) (Math.random() * highRangeOperators) + lowRangeOperators;
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

                //gameData[0] = "calculator";
        gameData[1] = Integer.toString(result);
        return gameData;
    }
}

