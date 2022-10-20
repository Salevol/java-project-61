package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 15;
    private static final int MAX_START_NUMBER = 20;
    private static final int MAX_STEP = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static String[] generateProgression(int length, int start, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + step * i);
        }
        return progression;
    }

    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        int length = Utils.generateNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int hiddenElementIndex = Utils.generateNumber(0, length);
        int start = Utils.generateNumber(1, MAX_START_NUMBER);
        int step = Utils.generateNumber(1, MAX_STEP);
        String[] progression = generateProgression(length, start, step);
        questionAnswer[1] = progression[hiddenElementIndex];
        progression[hiddenElementIndex] = "..";
        questionAnswer[0] = String.join(" ", progression);
        return questionAnswer;
    }
    public static void playGame(int victoryScore) {
        String[][] gameRounds = new String[victoryScore][2];
        for (int i = 0; i < victoryScore; i++) {
            gameRounds[i] = playRound();
        }
        Engine.play(DESCRIPTION, gameRounds);
    }
}
