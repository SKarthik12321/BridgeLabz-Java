package CoreProgramming.Extras.BuiltInFunctions.level2;

import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
