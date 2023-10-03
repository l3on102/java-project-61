package hexlet.code.games;

import hexlet.code.Utils;


public class Even implements Game {
    private final int lowRangeValue = 1;
    private final int highRangeValue = 20;
    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public final String[] getGameData() {
        String[] gameData = new String[2];

        int question = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(question);
        gameData[1] = question % 2 == 0 ? "yes" : "no";
        return gameData;
    }
}




