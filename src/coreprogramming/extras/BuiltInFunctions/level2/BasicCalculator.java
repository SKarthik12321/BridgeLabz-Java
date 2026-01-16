package CoreProgramming.Extras.BuiltInFunctions.level2;

import java.util.Scanner;

public class BasicCalculator {

    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("1.Add 2.Sub 3.Mul 4.Div : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> System.out.println(add(a, b));
            case 2 -> System.out.println(sub(a, b));
            case 3 -> System.out.println(mul(a, b));
            case 4 -> System.out.println(div(a, b));
        }

        sc.close();
    }
}
