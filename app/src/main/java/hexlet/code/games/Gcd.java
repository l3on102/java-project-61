package hexlet.code.games;

import hexlet.code.Games;

public class Gcd implements Games {
    public void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
    public String[] getGameData() {

        int lowRangeValue = 1;
        int highRangeValue = 20;
        String[] gameData = new String[2];

        double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        int num1 = (int) num1Double;
        double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
        int num2 = (int) num2Double;
        gameData[0] = num1 + " " + " " + num2;

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        gameData[1] = Integer.toString(num1 + num2);
        return gameData;
    }

}
