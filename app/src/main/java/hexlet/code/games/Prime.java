package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MAX_RANGE = 1000;

    public static String[] playRound() {
        Random rn = new Random();
        int number = rn.nextInt(MAX_RANGE);
        String[] questionAnswer = new String[2];
        questionAnswer[0] = Integer.toString(number);
        questionAnswer[1] = (isPrime(number)) ? "yes" : "no";
        return questionAnswer;
    }

    public static Boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void playGame() {
        Engine.greeting("6");
        int score = 0;
        while (score < Engine.VICTORY_SCORE) {
            score = Engine.play(score, playRound());
            Engine.roundResult(score);
        }
    }
}
