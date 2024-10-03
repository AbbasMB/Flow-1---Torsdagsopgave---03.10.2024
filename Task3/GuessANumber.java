import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner scan = new Scanner(System.in);
        boolean compare = false;
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            compare = input == rnd_number;
            System.out.println(compare);
            if (rnd_number > input) {
                System.out.println("Higher!");
            }
            if (rnd_number < input) {
                System.out.println("Lower!");
            }
        } else {
            System.out.println("ERROR - Please enter a number!");
        }

        if (!compare) {
            makeAGuess();
        } else {
            System.out.println("Congratz you guessed correct!");
        }
    }
}
