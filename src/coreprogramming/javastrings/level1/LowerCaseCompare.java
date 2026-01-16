package CoreProgramming.JavaStrings.level1;

import java.util.Scanner;

public class LowerCaseCompare {

    static String toLower(String s) {

        String r = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z')
                r = r + (char) (c + 32);
            else
                r = r + c;
        }

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

        String manual = toLower(text);
        String builtin = text.toLowerCase();

        System.out.println("Lowercase match: " + compare(manual, builtin));

        sc.close();
    }
}