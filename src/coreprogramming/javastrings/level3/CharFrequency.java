package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class CharFrequency {

    static void frequency(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        System.out.println("Char Frequency");

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] != 0) {
                System.out.println(s.charAt(i) + " " + freq[s.charAt(i)]);
                freq[s.charAt(i)] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        frequency(text);
        sc.close();
    }
}
