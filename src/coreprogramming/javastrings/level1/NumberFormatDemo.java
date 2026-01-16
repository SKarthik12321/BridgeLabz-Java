package CoreProgramming.JavaStrings.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    static void generate(String s) {
        Integer.parseInt(s);
    }

    static void handle(String s) {

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.next();

        try {
            generate(s);
        } catch (Exception e) {
        }

        handle(s);

        sc.close();
    }
}