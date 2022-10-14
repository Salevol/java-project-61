package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int MAX_RANGE = 1000;

    public static String[] playRound() {
        Random rn = new Random();
        int number = rn.nextInt(MAX_RANGE);
        String[] questionAnswer = new String[2];
        questionAnswer[0] = Integer.toString(number);
        questionAnswer[1] = (number % 2 == 0) ? "yes" : "no";
        return questionAnswer;
    }

    public static void playGame() {
        Engine.greeting("2");
        int score = 0;
        while (score < Engine.VICTORY_SCORE) {
            score = Engine.play(score, playRound());
            Engine.roundResult(score);
        }
    }
}


