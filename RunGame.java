package Eight_Task_Performance;

import java.util.Scanner;

public class RunGame implements Story, Survival, Name {
    public void readStory() {
        System.out.println("1 - Story");
    }
    public void survivalMode() {
        System.out.println("2 - Survival");
    }

    public void userName(String name) {
        System.out.print("Press P to start Playing, " + name);
    }

    public static void main(String[] args) {
        RunGame runGame = new RunGame();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = sc.nextLine();
        System.out.println("Press 1 or 2 to select your game mode.");
        runGame.readStory();
        runGame.survivalMode();
        runGame.userName(name);

    }

}
