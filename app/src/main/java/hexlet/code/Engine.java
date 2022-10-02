package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {

    private static final int VICTORY_SCORE = 3;

    public static String greeting(String gameId) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        switch (gameId) {
            case "6" -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            case "5" -> System.out.println("What number is missing in the progression?");
            case "4" -> System.out.println("Find the greatest common divisor of given numbers.");
            case "3" -> System.out.println("What is the result of the expression?");
            case "2" -> System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            default -> {
            }
        }
        return name;
    }

    public static void playGame(String gameId) {
        String name = Engine.greeting(gameId);
        int score = 0;
        while (score < VICTORY_SCORE) {
            switch (gameId) {
                case "6":
                    if (Prime.playRound()) {
                        score += 1;
                    } else {
                        score = VICTORY_SCORE + 1;
                    }
                    break;
                case "5":
                    if (Progression.playRound()) {
                        score += 1;
                    } else {
                        score = VICTORY_SCORE + 1;
                    }
                    break;
                case "4":
                    if (GCD.playRound()) {
                        score += 1;
                    } else {
                        score = VICTORY_SCORE + 1;
                    }
                    break;
                case "3":
                    if (Calc.playRound()) {
                        score += 1;
                    } else {
                        score = VICTORY_SCORE + 1;
                    }
                    break;
                case "2":
                    if (Even.playRound()) {
                        score += 1;
                    } else {
                        score = VICTORY_SCORE + 1;
                    }
                    break;
                default:
                    break;
            }
            roundResult(score, name);
        }
    }

    public static void roundResult(int score, String name) {
        if (score == VICTORY_SCORE) {
            System.out.println("Congratulations, " + name + "!");
        } else if (score > VICTORY_SCORE) {
            System.out.println("Let's try again, " + name);
        }
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
