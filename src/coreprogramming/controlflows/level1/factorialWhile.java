package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class factorialWhile {
    public static void main(String[] args) {

        System.out.print("Enter number n : ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println(factorial);
        sc.close();
    }
}