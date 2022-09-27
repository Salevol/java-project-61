package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        System.out.print("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
