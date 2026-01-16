package CoreProgramming.ControlFlows.level1;

import java.util.*;

public class NaturalSumFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n = sc.nextInt();

        if (n>0){
            int formulaSum = n*(n+1)/2;
            int loopSum = 0;
            for(int i=1; i<=n; i++){
                loopSum += i;
            }
            System.out.println(formulaSum);
            System.out.println(loopSum);
        }
        sc.close();
    }
}

