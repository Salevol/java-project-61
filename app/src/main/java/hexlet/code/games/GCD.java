package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.checkAnswer;

public class GCD {

    private static final int MAX_RANGE = 999;

    public static Boolean playRound() {
        Random rn = new Random();
        int number1 = 1 + rn.nextInt(MAX_RANGE);
        int number2 = 1 + rn.nextInt(MAX_RANGE);
        System.out.println("Question: " + number1 + " " + number2);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return checkAnswer(calculateGCD(number1, number2), answer);
    }

    public static String calculateGCD(int number1, int number2) {
        int r = number1 % number2;
        if (r == 0) {
            return Integer.toString(number2);
        } else {
            return calculateGCD(number2, r);
        }
    }
}
