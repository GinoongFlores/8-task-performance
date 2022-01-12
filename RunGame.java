package Eight_Task_Performance;

import java.util.Objects;
import java.util.Scanner;

public class RunGame implements Story, Survival, Name {
    public void readStory() {
        System.out.println("\nWelcome to Story Mode");
    }
    public void survivalMode() {
        System.out.println("\nWelcome to Survival Mode");
    }

    public void userName(String name) {
        System.out.print("Press P to start Playing, " + name + ": ");
    }

    public static void main(String[] args) {
        RunGame runGame = new RunGame();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = sc.nextLine();
        System.out.println("Press 1 or 2 to select your game mode.\n1 - Story\n2 - Survival");
        int choice = sc.nextInt();
        if (choice == 1) {
            runGame.userName(name);
            String press = sc.next();
            if(press.equalsIgnoreCase("P")) {
                runGame.readStory();
            }
        } else if (choice == 2) {
            runGame.userName(name);
            String press = sc.next();
            if (press.equalsIgnoreCase("P")) {
                runGame.survivalMode();
            }
        } else {
            System.out.println("Invalid input please try again...");
        }

    }

}
