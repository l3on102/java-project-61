package hexlet.code;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        int userSelected = scanner.nextInt();
        System.out.println("Your choice: " + userSelected);
        //System.out.println("Welcome to the Brain Games!");
        switch (userSelected) {
            case 0:
            scanner.close();
            break;
            case 1:
                Cli.newUser();
            break;
            case 2:
                    Engine.helloUser(new Even());

            break;
            case 3:

                Engine.helloUser(new Calculator());

            break;
        }
    }
}
