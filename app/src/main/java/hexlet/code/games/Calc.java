package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        int number1 = Utils.generateNumber(MIN, MAX);
        int number2 = Utils.generateNumber(MIN, MAX);
        char operator = OPERATORS[Utils.generateNumber(0, OPERATORS.length)];
        questionAnswer[0] = (number1 + " " + operator + " " + number2);
        questionAnswer[1] = Integer.toString(calculate(operator, number1, number2));
        return questionAnswer;
    }
    public static int calculate(char operator, int number1, int number2) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
    public static void playGame(int victoryScore) {
        String[][] gameRounds = new String[victoryScore][2];
        for (int i = 0; i < victoryScore; i++) {
            gameRounds[i] = playRound();
        }
        Engine.play(DESCRIPTION, gameRounds);
    }
}
