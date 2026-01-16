package CoreProgramming.ProgrammingElements.level2;

import java.util.*;

public class WeightConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds : ");
        double pounds = sc.nextDouble();
        double kilograms = pounds / 2.2;

        kilograms = Math.round(kilograms * 100.0)/100.0;

        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);
        sc.close();
    }
}
