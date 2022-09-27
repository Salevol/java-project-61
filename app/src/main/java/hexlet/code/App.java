package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "2 - Even\n"
                + "1 - Greet\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "2":
                Even.game();
                break;
            case "1":
                String name = Cli.greeting();
                break;
            case "0":
                break;
            default:
                System.out.print("Wrong choice");
        }
    }
}
