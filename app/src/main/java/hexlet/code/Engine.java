package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int VICTORY_SCORE = 3;
    private static String name = new String();

    public static void greeting(String gameId) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        switch (gameId) {
            case "6" -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            case "5" -> System.out.println("What number is missing in the progression?");
            case "4" -> System.out.println("Find the greatest common divisor of given numbers.");
            case "3" -> System.out.println("What is the result of the expression?");
            case "2" -> System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            default -> throw new RuntimeException("Game " + gameId + " not yet implemented");
        }
    }

    public static int play(int score, String[] questionAnswer) {
        System.out.println("Question: " + questionAnswer[0]);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        int newScore = score;
        if (checkAnswer(questionAnswer[1], answer)) {
            newScore += 1;
        } else {
            newScore = VICTORY_SCORE + 1;
        }
        return newScore;
    }

    public static void roundResult(int score) {
        if (score == VICTORY_SCORE) {
            System.out.println("Congratulations, " + name + "!");
        } else if (score > VICTORY_SCORE) {
            System.out.println("Let's try again, " + name + "!");
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
