package hexlet.code.games;

import hexlet.code.Games;



public class Prime implements Games {
    @Override
    public void getRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public  String[] getGameData() {
        int lowRangeValue = 1;
        int highRangeValue = 20;
        String[] gameData = new String[2];
        double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
        int num = (int) num1Double;
        gameData[0] = Integer.toString(num);
        if (num < 2) {
            gameData[1] = "no";
        }
        if (num == 2) {
            gameData[1] = "yes";
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                gameData[1] = "no";
                break;
        }   else {gameData[1] = "yes";
            }
        }
        //System.out.println(Arrays.togradle String(gameData));
        return gameData;
    }
}
