package CoreProgramming.ProgrammingElements.level2;

import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number2 : ");
        double number2 = sc.nextDouble();
        double quotient = number1 / number2;
        double remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two number " + number1 + " and " + number2);
        sc.close();
    }
}

