package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MIN = 1;
    private static final int MAX = 1000;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        int number1 = Utils.generateNumber(MIN, MAX);
        int number2 = Utils.generateNumber(MIN, MAX);
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

    public static void playGame(int victoryScore) {
        String[][] gameRounds = new String[victoryScore][2];
        for (int i = 0; i < victoryScore; i++) {
            gameRounds[i] = playRound();
        }
        Engine.play(DESCRIPTION, gameRounds);
    }
}
