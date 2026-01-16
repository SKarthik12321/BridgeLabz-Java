package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class StringLengthManual {

    static int findLength(String s) {

        int count = 0;

        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Manual length : " + findLength(text));
        System.out.println("Builtin length: " + text.length());

        sc.close();
    }
}