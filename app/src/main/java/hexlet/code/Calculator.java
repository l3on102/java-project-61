package hexlet.code;
import java.util.Scanner;

public class Calculator {

    public static void newCalculator() {
        int answer = 0;
        int solution = 0;
        int countI = 0;
        int lowRangeValue = 1;
        int highRangeValue = 20;
        String[] arithmeticOperators = {"/", "+", "-", "*"};
        int lowRangeOperators = 1;
        int highRangeOperators = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        for (; countI < 3;) {
            double num1Double = (Math.random() * highRangeValue) + lowRangeValue;
            int num1 = (int) num1Double;
            double num2Double = (Math.random() * highRangeValue) + lowRangeValue;
            int num2 = (int) num2Double;
            double randomOperator = (Math.random() * highRangeOperators) + lowRangeOperators;
            int random = (int) randomOperator;
            String operator = arithmeticOperators[random];
            System.out.println("Question: " + num1 + " " + operator + " " + num2);
            answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);


            if (operator.contains("+")) {
                solution = num1 + num2;
                if (solution == answer) {
                    System.out.println("Correct!");
                    countI++;
                } else {
                    break;
                }
            } else if (operator.contains("-")) {
                solution = num1 - num2;
                if (solution == answer) {
                    System.out.println("Correct!");
                    countI++;
                } else {
                    break;
                }
            }
            if (operator.contains("*")) {
                solution = num1 * num2;
                if (solution == answer) {
                    System.out.println("Correct!");
                    countI++;
                } else {
                    break;
                }
            }
        }
        if (countI == 3) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + solution + "'."
                        + "\n Let's try again, " + userName + "!");
            scanner.close();
        }
    }
}

