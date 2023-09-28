package hexlet.code.games;

import hexlet.code.Utils;


public class Calculator implements Game {
    private final int lowRangeValue = 1;
    private final int highRangeValue = 20;
    private final int lowRangeOperators = 1;
    private final int highRangeOperators = 3;
    private String[] arithmeticOperators = {"/", "+", "-", "*"};
    public final String getRules() {
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
            default:
                System.out.println("wrong operator");
                break;
        }
        gameData[1] = Integer.toString(result);
        return gameData;
    }
}

