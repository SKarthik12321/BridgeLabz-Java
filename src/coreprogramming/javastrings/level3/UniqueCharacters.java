package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class UniqueCharacters {

    static char[] unique(String s) {

        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count++] = s.charAt(i);
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] u = unique(text);

        System.out.print("Unique characters: ");
        for (char c : u)
            System.out.print(c + " ");

        sc.close();
    }
}
