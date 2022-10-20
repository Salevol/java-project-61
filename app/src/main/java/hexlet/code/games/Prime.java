package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    private static final int MIN = 1;
    private static final int MAX = 1000;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[] playRound() {
        int number = Utils.generateNumber(MIN, MAX);
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
    public static void playGame(int victoryScore) {
        String[][] gameRounds = new String[victoryScore][2];
        for (int i = 0; i < victoryScore; i++) {
            gameRounds[i] = playRound();
        }
        Engine.play(DESCRIPTION, gameRounds);
    }
}
