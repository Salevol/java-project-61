package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.checkAnswer;

public class Even {
    private static final int MAX_RANGE = 1000;

    public static Boolean playRound() {
        Random rn = new Random();
        int number = rn.nextInt(MAX_RANGE);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (number % 2 == 0) {
            return checkAnswer("yes", answer);
        } else {
            return checkAnswer("no", answer);
        }
    }
}


