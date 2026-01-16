package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class SplitCompare {

    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }
        return c;
    }

    static String[] manualSplit(String text) {

        int words = 1;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];
        int index = 0;
        String word = "";

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                arr[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        arr[index] = word;
        return arr;
    }

    static boolean compare(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Both same: " + compare(manual, builtin));

        sc.close();
    }
}