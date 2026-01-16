package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class TrimCompare {

    static int[] trimIndex(String s) {

        int start = 0, end = s.length() - 1;

        while (s.charAt(start) == ' ')
            start++;

        while (s.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    static String substring(String s, int st, int en) {

        String r = "";
        for (int i = st; i < en; i++)
            r += s.charAt(i);

        return r;
    }

    static boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String manual = substring(text, idx[0], idx[1]);
        String builtin = text.trim();

        System.out.println("Trim match: " + compare(manual, builtin));

        sc.close();
    }
}