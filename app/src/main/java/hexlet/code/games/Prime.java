package hexlet.code.games;

import hexlet.code.Utils;




public class Prime implements Game {

    private final int lowRangeValue = 1;
    private final int highRangeValue = 20;

    @Override
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getGameData() {

        String[] gameData = new String[2];
        int num = Utils.getRandomNumber(lowRangeValue, highRangeValue);
        gameData[0] = Integer.toString(num);
        gameData[1] = isPrime(num);
        return gameData;
    }

    private String isPrime(int num) {

        String answer = "";

        if (num < 2) {
            answer = "no";
        }
        if (num == 2) {
            answer = "yes";
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = "no";
                break;
            } else {
                answer = "yes";
            }
        }
        return answer;
    }
}
