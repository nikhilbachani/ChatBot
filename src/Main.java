import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*  Stage 1: Hello! What's your name? */
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");

        /* Stage 2: What's my name? */
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        /* Stage 3: How old are you? */
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders of dividing your age by 3, 5, and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        // Using the Chinese Remainder Theorem, we can calculate the user's age.
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + ", that's a good time to start programming.");

        /* Stage 4: Let's count! */
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("Enter a number: ");

        int maxCount = scanner.nextInt();
        for (int i = 0; i <= maxCount; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Completed, have a nice day!");
    }
}
