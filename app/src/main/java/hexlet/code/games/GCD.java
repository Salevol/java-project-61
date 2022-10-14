package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    private static final int MAX_RANGE = 999;

    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        Random rn = new Random();
        int number1 = 1 + rn.nextInt(MAX_RANGE);
        int number2 = 1 + rn.nextInt(MAX_RANGE);
        questionAnswer[0] = (number1 + " " + number2);
        questionAnswer[1] = Integer.toString(calculateGCD(number1, number2));
        return questionAnswer;
    }

    public static int calculateGCD(int number1, int number2) {
        int r = number1 % number2;
        if (r == 0) {
            return number2;
        } else {
            return calculateGCD(number2, r);
        }
    }

    public static void playGame() {
        Engine.greeting("4");
        int score = 0;
        while (score < Engine.VICTORY_SCORE) {
            score = Engine.play(score, playRound());
            Engine.roundResult(score);
        }
    }
}
