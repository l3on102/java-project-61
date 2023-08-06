package hexlet.code.games;

import hexlet.code.Games;

public class Calculator implements Games {

    public void getRules() {
        System.out.println("What is the result of the expression?");
    }
    public String[] getGameData() {
        int lowRangeValue = 1;
        int highRangeValue = 20;
        String[] arithmeticOperators = {"/", "+", "-", "*"};
        int lowRangeOperators = 1;
        int highRangeOperators = 3;
        String[] gameData = new String [2];
        int result = 0;
        double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        int num1 = (int) num1Double;
        double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
        int num2 = (int) num2Double;
        int random = (int) (Math.random() * highRangeOperators) + lowRangeOperators;
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
        return gameData ;
    }
}

