package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN = 1;
    private static final int MAX = 1000;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static String[] playRound() {
        int number = Utils.generateNumber(MIN, MAX);
        String[] questionAnswer = new String[2];
        questionAnswer[0] = Integer.toString(number);
        questionAnswer[1] = (number % 2 == 0) ? "yes" : "no";
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



