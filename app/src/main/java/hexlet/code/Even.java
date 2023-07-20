package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void newEvenGame() {

        int countI = 0;
        int lowRangeValue = 1;
        int highRangeValue = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for ( ; countI < 3;) {
            double questionDouble = (Math.random() * highRangeValue) + lowRangeValue;
            int question = (int) questionDouble;
            System.out.println("Question: " + question);
            String answerTheQuestion = scanner.next();
            if (answerTheQuestion.equalsIgnoreCase("yes") && question % 2 < 1) {
                //System.out.println(question % 2);
                System.out.println("Correct!");
                countI++;
                //System.out.println(i);
            } else if (answerTheQuestion.equalsIgnoreCase("no") && question % 2 > 0) {
                //System.out.println(question % 2);
                System.out.println("Correct!");
                countI++;
                //System.out.println(i);
            } else {
                break;
            }
        }
        if (countI == 3) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'."
                    + "\n Let's try again, " + userName + "!");
            //System.out.println("neCorrect!");
        }
    }
}




