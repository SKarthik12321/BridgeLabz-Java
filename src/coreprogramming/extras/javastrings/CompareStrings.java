package CoreProgramming.Extras.JavaStrings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        int len = Math.min(s1.length(), s2.length());
        int flag = 0;

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                flag = -1;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            flag = Integer.compare(s1.length(), s2.length());

        if (flag < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (flag > 0)
            System.out.println(s2 + " comes before " + s1);
        else
            System.out.println("Both strings are equal");

        sc.close();
    }
}
