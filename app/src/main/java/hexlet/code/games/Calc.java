package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.checkAnswer;

public class Calc {
    private static final int MAX_RANGE = 100;

    public static Boolean playRound() {
        String[] operations = {"+", "-", "*"};
        Random rn = new Random();
        int number1 = rn.nextInt(MAX_RANGE);
        int number2 = rn.nextInt(MAX_RANGE);
        String operation = operations[rn.nextInt(operations.length)];
        System.out.println("Question: " + number1 + " " + operation + " " + number2);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        String correctAnswer = switch (operation) {
            case "+" -> Integer.toString(number1 + number2);
            case "-" -> Integer.toString(number1 - number2);
            case "*" -> Integer.toString(number1 * number2);
            default -> "";
        };
        return checkAnswer(correctAnswer, answer);
    }
}
