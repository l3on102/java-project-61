package hexlet.code;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        int userSelected = scanner.nextInt();
        System.out.println("Your choice: " + userSelected);
        //System.out.println("Welcome to the Brain Games!");
        if (userSelected == 0) {
            scanner.close();
        } else if (userSelected == 1) {
            Cli.newUser();
        } else if (userSelected == 2) {
            Even.newEvenGame();
        }
    }
}
