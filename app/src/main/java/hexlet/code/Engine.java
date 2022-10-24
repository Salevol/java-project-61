package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int VICTORY_SCORE = 3;

    public static void play(String description, String[][] gameRounds) {
        int victoryScore = gameRounds.length;
        int score = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        if (!description.equals("1")) {
            System.out.println(description);
        }
        while (score < victoryScore) {
            System.out.println("Question: " + gameRounds[score][0]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            String correctAnswer = gameRounds[score][1];
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                score = victoryScore + 1;
            }
            if (score == victoryScore) {
                System.out.println("Congratulations, " + name + "!");
            } else if (score > victoryScore) {
                System.out.println("Let's try again, " + name + "!");
            }
        }
    }
}
