package hexlet.code;

//import hexlet.code.games.Even;

public class Utils {
    public static int getRandomNumber(int lowRangeValue, int highRangeValue){

        double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        int question = (int) questionDouble;
        return question;
    }
    public static boolean isEven(int number){
        if (number % 2 < 1) {
            return true;
        } else {
            return false;
        }
    }
}
