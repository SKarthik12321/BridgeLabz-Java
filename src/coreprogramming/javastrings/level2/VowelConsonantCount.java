package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class VowelConsonantCount {

    static int[] count(String s) {

        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z')
                c = (char)(c + 32);

            if (c >= 'a' && c <= 'z') {
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] r = count(text);

        System.out.println("Vowels     : " + r[0]);
        System.out.println("Consonants : " + r[1]);

        sc.close();
    }
}
