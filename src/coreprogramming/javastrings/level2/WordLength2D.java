package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class WordLength2D {

    static int length(String s) {
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

    static String[] splitWords(String text) {

        int count = 1;
        for (int i = 0; i < length(text); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];
        String w = "";
        int idx = 0;

        for (int i = 0; i < length(text); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = w;
                w = "";
            } else {
                w += text.charAt(i);
            }
        }

        words[idx] = w;
        return words;
    }

    static String[][] to2D(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(length(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = to2D(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
}