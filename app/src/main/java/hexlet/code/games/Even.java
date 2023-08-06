package hexlet.code.games;

import hexlet.code.Games;

public class Even implements Games {
    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public String[] getGameData() {
        String[] gameData = new String [2];
        int lowRangeValue = 1;
        int highRangeValue = 20;
        double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        int question = (int) questionDouble;
        gameData[0] = Integer.toString(question);
        if (question % 2 < 1) {
            gameData[1] = "yes";
        } else {
            gameData[1] = "no";
        }
        return gameData;
    }
}




