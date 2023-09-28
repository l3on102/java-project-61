package hexlet.code.games;

import hexlet.code.Utils;


public class Progression implements Game {
    private final int lowRangeValue = 1;
    private final int highRangeValue = 20;
    private final int numbers = 10;
    private final int lowRangeValueNumbers = 0;
    private final int highRangeValueNumbers = numbers - 1;

    public String getRules() {
        return "What number is missing in the progression?";
    }

    public  String[] getGameData() {

        String[] gameData;

        int numStart = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int numStep = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int randomIntNumber = Utils.getRandomNumber(lowRangeValueNumbers, highRangeValueNumbers);
        gameData = progressionCreation(numStart, numStep, randomIntNumber);

        return gameData;
    }
    private String[] progressionCreation(int numStart, int numStep, int randomIntNumber) {
        String[] progressionData = new String[2];
        int temporary = 0;
        temporary = numStart;
        StringBuilder progressionString =  new StringBuilder();
        for (int i = 0; i < numbers; i++) {
            temporary = temporary + numStep;
            if (i == randomIntNumber) {
                progressionData[1] = String.valueOf(temporary);
                progressionString.append("..");
                progressionString.append(" ");
            } else {
                progressionString.append(temporary);
                progressionString.append(" ");
            }

        }
        progressionData[0] = progressionString.toString();
        return progressionData;
    }

}

