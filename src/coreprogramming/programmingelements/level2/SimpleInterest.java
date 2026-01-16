package CoreProgramming.ProgrammingElements.level2;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        double principal = sc.nextDouble();
        System.out.print("Enter interest rate : ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter time : ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * interestRate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                ", Rate of Interest " + interestRate + " and Time " + time);
        sc.close();
    }
}
