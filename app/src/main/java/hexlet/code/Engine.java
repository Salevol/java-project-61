package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String name = "";

    public static void greeting(String description) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        if (!description.equals("1")) {
            System.out.println(description);
        }
    }

    public static void play(String description, String[][] gameRounds) {
        int victoryScore = gameRounds.length;
        int score = 0;
        Engine.greeting(description);
        while (score < victoryScore) {
            String answer = dealRound(gameRounds[score][0]);
            String correctAnswer = gameRounds[score][1];
            if (checkAnswer(correctAnswer, answer)) {
                score++;
            } else {
                score = victoryScore + 1;
            }
            roundResult(score, victoryScore);
        }
    }

    public static String dealRound(String question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static void roundResult(int score, int victoryScore) {
        if (score == victoryScore) {
            System.out.println("Congratulations, " + name + "!");
        } else if (score > victoryScore) {
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
