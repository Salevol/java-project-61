package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int MAX_RANGE = 100;

    public static String[] playRound() {
        String[] questionAnswer = new String[2];
        String[] operations = {"+", "-", "*"};
        Random rn = new Random();
        int number1 = rn.nextInt(MAX_RANGE);
        int number2 = rn.nextInt(MAX_RANGE);
        String operator = operations[rn.nextInt(operations.length)];
        questionAnswer[0] = (number1 + " " + operator + " " + number2);
        questionAnswer[1] = switch (operator) {
            case "+" -> Integer.toString(number1 + number2);
            case "-" -> Integer.toString(number1 - number2);
            case "*" -> Integer.toString(number1 * number2);
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
        return questionAnswer;
    }
    public static void playGame() {
        Engine.greeting("3");
        int score = 0;
        while (score < Engine.VICTORY_SCORE) {
            score = Engine.play(score, playRound());
            Engine.roundResult(score);
        }
    }
}
