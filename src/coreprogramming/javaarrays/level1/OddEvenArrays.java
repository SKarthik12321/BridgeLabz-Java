package CoreProgramming.JavaArrays.level1;

import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number");
            System.exit(0);
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        for (int i = 0; i < oddIndex; i++)
            System.out.println(odd[i]);

        for (int i = 0; i < evenIndex; i++)
            System.out.println(even[i]);

        sc.close();
    }
}