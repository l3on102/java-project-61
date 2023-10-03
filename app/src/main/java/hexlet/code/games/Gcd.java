package hexlet.code.games;

import hexlet.code.Utils;


public class Gcd implements Game {
    private final int lowRangeValue = 1;
    private final int highRangeValue = 20;
    public final String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public final String[] getGameData() {

        String[] gameData = new String[2];

        int num1 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int num2 = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = num1 + " " + num2;
        gameData[1] = getGCD(num1, num2);
        return gameData;
    }

    private static String getGCD(int num1, int num2) {
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
