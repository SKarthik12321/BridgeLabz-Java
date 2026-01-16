package CoreProgramming.JavaMethods.level2;

import java.util.*;

public class SumCompare {
    static int rec(int n){
        if(n==0) return 0;
        return n + rec(n-1);
    }
    static int formula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
        System.out.println(formula(n));
        sc.close();
    }
}