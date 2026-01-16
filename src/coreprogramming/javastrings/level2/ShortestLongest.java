package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class ShortestLongest {

    static int len(String s) {
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

    static String[] split(String text) {

        int words = 1;
        for (int i = 0; i < len(text); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];
        String w = "";
        int idx = 0;

        for (int i = 0; i < len(text); i++) {
            if (text.charAt(i) == ' ') {
                arr[idx++] = w;
                w = "";
            } else {
                w += text.charAt(i);
            }
        }

        arr[idx] = w;
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = split(text);

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (len(words[i]) < len(shortest))
                shortest = words[i];
            if (len(words[i]) > len(longest))
                longest = words[i];
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word : " + longest);

        sc.close();
    }
}
