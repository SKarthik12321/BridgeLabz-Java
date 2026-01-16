package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class FirstNonRepeating {

    static char firstUnique(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char c = firstUnique(text);

        if (c != '\0')
            System.out.println("First non-repeating character: " + c);
        else
            System.out.println("No unique character");

        sc.close();
    }
}
