package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Arrays;

public class Progression implements Game {
    final int lowRangeValue = 1;
    final int highRangeValue = 20;
    final int numbers = 10;
    final int lowRangeValueNumbers = 0;
    final int highRangeValueNumbers = numbers - 1;

    public String getRules() {
        return "What number is missing in the progression?";
    }

    public  String[] getGameData() {

        String[] gameData ;

        int numStart = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int numStep = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        int randomIntNumber = Utils.getRandomNumber(lowRangeValueNumbers, highRangeValueNumbers);
        gameData = progressionCreation(numStart, numStep, randomIntNumber, numbers);

        return gameData;
    }
    private String[] progressionCreation(int numStart, int numStep, int randomIntNumber, int numbers){
        String[] progressionData = new String[2];
        int temporary = 0;
        temporary = numStart;
        StringBuilder progressionString =  new StringBuilder();
        for (int i = 0; i < numbers; i++) {
            temporary = temporary + numStep;
            if (i == randomIntNumber){
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

