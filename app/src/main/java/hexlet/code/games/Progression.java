package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int PROGRESSION_RANGE = 10;
    private static final int MAX_START_NUMBER = 20;
    private static final int MAX_STEP = 10;

    public static String[] generateProgression(int length, int start, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + step * i);
        }
        return progression;
    }

    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        Random rn = new Random();
        int length = rn.nextInt(PROGRESSION_RANGE) + MIN_PROGRESSION_LENGTH;
        int hiddenElementIndex = rn.nextInt(length);
        int start = rn.nextInt(MAX_START_NUMBER);
        int step = rn.nextInt(MAX_STEP);
        String[] progression = generateProgression(length, start, step);
        questionAnswer[1] = progression[hiddenElementIndex];
        progression[hiddenElementIndex] = "..";
        questionAnswer[0] = String.join(" ", progression);
        return questionAnswer;
    }

    public static void playGame() {
        Engine.greeting("5");
        int score = 0;
        while (score < Engine.VICTORY_SCORE) {
            score = Engine.play(score, playRound());
            Engine.roundResult(score);
        }
    }

}
