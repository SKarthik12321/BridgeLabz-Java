package CoreProgramming.JavaStrings.level1;

import java.util.Scanner;

public class StringIndexDemo {

    static void generate(String s) {
        s.charAt(s.length());
    }

    static void handle(String s) {

        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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
