package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void game() {
        int result = 0;
        int victoryScore = 3;
        String name = Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (result < victoryScore) {
            if (round()) {
                result += 1;
                if (result == 3) System.out.println("Congratulations, " + name + "!");
            } else {
                System.out.println("Let's try again, " + name);
                break;
            }
        }
    }

    public static Boolean round() {
        Random rn = new Random();
        int maxRange = 1000;
        int number = rn.nextInt(maxRange);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String correctAnswer;
        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return checkAnswer(correctAnswer, input);
    }

    public static Boolean checkAnswer(String answer, String input) {
        if (input.equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + answer + "'");
        return false;
    }
}


