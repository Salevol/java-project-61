package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {

    private static final int VICTORY_SCORE = 3;

    public static String greeting() {
        System.out.print("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void playGame(String gameId) {
        String name = Engine.greeting();
        int score = 0;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (score < VICTORY_SCORE) {
            switch (gameId) {
                case "3" -> score = roundResult(Calc.playRound(), score, name);
                case "2" -> score = roundResult(Even.playRound(), score, name);
                default -> {
                }
            }
        }
    }

    public static int roundResult(Boolean result, int score, String name) {
        int newScore = score;
        if (result) {
            newScore += 1;
            if (newScore == VICTORY_SCORE) {
                System.out.println("Congratulations, " + name + "!");
            }
        } else {
            System.out.println("Let's try again, " + name);
            newScore = VICTORY_SCORE + 1;
        }
        return newScore;
    }

    public static Boolean checkAnswer(String correctAnswer, String answer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        return false;
    }
}
