import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Stage 1: Hello! What's your name?
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");

        // Stage 2: What's my name?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, remind me your name");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
