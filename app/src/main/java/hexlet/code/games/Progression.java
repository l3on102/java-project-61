package hexlet.code.games;

import hexlet.code.Games;

import java.util.Arrays;

public class Progression implements Games {
    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    public  String[] getGameData() {
        int lowRangeValue = 1;
        int highRangeValue = 20;
        int numbers = 10;
        int temporary = 0;
        int[] progression = new int[numbers];
        String[] gameData = new String[2];

        double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        int numStart = (int) num1Double;
        double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
        int numStep = (int) num2Double;
        double num3Double = (Math.random() * (numbers - 1)) + (lowRangeValue - 1);
        int randomIntNumber = (int) num3Double;


        temporary = numStart;

        for (int i = 0; i < numbers; i++) {
            temporary = temporary + numStep;
            progression[i] = temporary;
        }
        gameData[1] = String.valueOf(progression[randomIntNumber]);

        progression[randomIntNumber] = 999;

        String progressionString = Arrays.toString(progression);
        progressionString = progressionString.replaceAll(String.valueOf(999),"..")
                .replaceAll(", ", " ");
        gameData[0] = progressionString;
        //System.out.println(Arrays.toString(gameData));

        return gameData;
    }


    }

