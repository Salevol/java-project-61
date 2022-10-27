package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "6":
                Prime.playGame();
                break;
            case "5":
                Progression.playGame();
                break;
            case "4":
                GCD.playGame();
                break;
            case "3":
                Calc.playGame();
                break;
            case "2":
                Even.playGame();
                break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                Scanner input = new Scanner(System.in);
                String name = input.nextLine();
                System.out.println("Hello, " + name + "!");
                break;
            case "0":
                break;
            default:
                throw new RuntimeException("Game " + choice + " not yet implemented");
        }
    }
}
