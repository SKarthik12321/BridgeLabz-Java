package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class CharacterType {

    static String check(char c) {

        if (c >= 'A' && c <= 'Z')
            c = (char)(c + 32);

        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t" + check(text.charAt(i)));
        }

        sc.close();
    }
}
