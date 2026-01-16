package CoreProgramming.Extras.BuiltInFunctions.level2;

import java.util.Scanner;

public class TemperatureConverter {

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.C to F  2.F to C : ");
        int ch = sc.nextInt();

        System.out.print("Enter temperature: ");
        double t = sc.nextDouble();

        if (ch == 1)
            System.out.println("Result: " + cToF(t));
        else
            System.out.println("Result: " + fToC(t));

        sc.close();
    }
}
