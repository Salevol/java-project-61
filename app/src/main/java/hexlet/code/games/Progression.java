package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.checkAnswer;

public class Progression {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int PROGRESSION_RANGE = 10;
    private static final int MAX_START_NUMBER = 20;
    private static final int MAX_STEP = 10;

    public static String[] generateProgression(int length, int start, int step, int hiddenElementIndex) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            String nextMember = String.valueOf(start + step * i);
            progression[i] = nextMember;
            if (i != hiddenElementIndex) {
                System.out.print(nextMember + " ");
            } else {
                System.out.print(".. ");
            }
        }
        System.out.println("");
        return progression;
    }

    public static Boolean playRound() {
        Random rn = new Random();
        int length = rn.nextInt(PROGRESSION_RANGE) + MIN_PROGRESSION_LENGTH;
        int hiddenElementIndex = rn.nextInt(length);
        int start = rn.nextInt(MAX_START_NUMBER);
        int step = rn.nextInt(MAX_STEP);
        System.out.print("Question: ");
        String[] progression = generateProgression(length, start, step, hiddenElementIndex);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return checkAnswer(progression[hiddenElementIndex], answer);
    }
}
