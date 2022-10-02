package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "6":
            case "5":
            case "4":
            case "3":
            case "2":
                Engine.playGame(choice);
                break;
            case "1":
                String name = Engine.greeting(choice);
                break;
            case "0":
                break;
            default:
                System.out.print("Wrong choice");
        }
    }
}
