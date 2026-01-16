package CoreProgramming.JavaStrings.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generate(String s) {
        s.substring(5, 2);
    }

    static void handle(String s) {

        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        try {
            generate(s);
        } catch (Exception e) {
        }

        handle(s);

        sc.close();
    }
}
