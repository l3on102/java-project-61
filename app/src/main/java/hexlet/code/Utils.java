package hexlet.code;

//import hexlet.code.games.Even;

public class Utils {
    public static int getRandomNumber(int lowRangeValue, int highRangeValue) {

        double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
        int question = (int) questionDouble;
        return question;
    }
    public static String isEven(int number) {
       /* return ((number % 2) < 1);*/
        if (((number % 2) < 1)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
