package CoreProgramming.ControlFlows.level1;

import java.util.*;

public class NaturalSumWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        if (n>0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println(formulaSum);
            System.out.println(loopSum);
        }
        sc.close();
    }
}
