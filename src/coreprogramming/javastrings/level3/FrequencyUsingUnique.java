package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] unique(String s) {

        char[] temp = new char[s.length()];
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                temp[c++] = s.charAt(i);
        }

        char[] res = new char[c];
        for (int i = 0; i < c; i++)
            res[i] = temp[i];

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] u = unique(text);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (c == text.charAt(i))
                    count++;
            }
            System.out.println(c + " " + count);
        }

        sc.close();
    }
}
