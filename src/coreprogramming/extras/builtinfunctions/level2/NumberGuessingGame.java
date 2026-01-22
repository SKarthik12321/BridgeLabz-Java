package CoreProgramming.Extras.BuiltInFunctions.level2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100");

        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high / low / correct): ");
            feedback = sc.next();

            if (feedback.equals("high"))
                high = guess - 1;
            else if (feedback.equals("low"))
                low = guess + 1;
        }

        System.out.println("Guessed correctly!");
        sc.close();
    }
}
