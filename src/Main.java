import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    /*  Stage 1: Hello! What's your name? */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    /* Stage 2: What's my name? */
    static void remindName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /* Stage 3: How old are you? */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders of dividing your age by 3, 5, and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        // Using the Chinese Remainder Theorem, we can calculate the user's age.
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + ", that's a good time to start programming.");
    }

    /* Stage 4: Let's count! */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("Enter a number: ");

        int maxCount = scanner.nextInt();
        for (int i = 0; i <= maxCount; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /* Stage 5: The student and the teacher */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (true) {
            System.out.print("Enter a numeric choice: ");
            if (scanner.nextInt() != 2) {
                System.out.println("Incorrect! Please, try again.");
            } else {
                System.out.println("Correct answer!");
                break;
            }
        }
    }

    static void end() {
        System.out.println("Bye now, have a nice day!");
    }

    public static void main(String[] args) {
        greet("Aid", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }
}
