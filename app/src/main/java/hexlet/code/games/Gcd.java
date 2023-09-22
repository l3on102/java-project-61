package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.Game;

public class Gcd implements Game {
    final int lowRangeValue = 1;
    final int highRangeValue = 20;
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public String[] getGameData() {

        //int lowRangeValue = 1;
        //int highRangeValue = 20;
        String[] gameData = new String[2];

        //double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        //int num1 = (int) num1Double;
        int num1 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        //double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
        //int num2 = (int) num2Double;
        int num2 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = num1 + " " + " " + num2;

        /*while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        gameData[1] = Integer.toString(num1 + num2);*/
        gameData[1] = lokingGCD( num1, num2);
        return gameData;
    }

        private String lokingGCD(int num1, int num2) {
            while (num1 != 0 && num2 != 0) {
                if (num1 > num2) {
                    num1 = num1 % num2;
                } else {
                    num2 = num2 % num1;
                }
            }
            return Integer.toString(num1 + num2);
        }
}
