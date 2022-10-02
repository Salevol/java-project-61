package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.checkAnswer;

public class Prime {
    private static final int MAX_RANGE = 1000;

    public static Boolean playRound() {
        Random rn = new Random();
        int number = rn.nextInt(MAX_RANGE);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return checkAnswer(isPrime(number), answer);
    }

    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
