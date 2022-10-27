package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN = 1;
    private static final int MAX = 1000;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] playRound() {
        int number = Utils.generateNumber(MIN, MAX);
        String[] questionAnswer = new String[2];
        questionAnswer[0] = Integer.toString(number);
        questionAnswer[1] = (number % 2 == 0) ? "yes" : "no";
        return questionAnswer;
    }

    public static void playGame() {
        String[][] gameRounds = new String[Engine.VICTORY_SCORE][2];
        for (int i = 0; i < Engine.VICTORY_SCORE; i++) {
            gameRounds[i] = playRound();
        }
        Engine.play(DESCRIPTION, gameRounds);
    }
}



