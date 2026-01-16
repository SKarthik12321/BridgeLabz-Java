package CoreProgramming.JavaMethods.level2;

import java.util.*;

public class UnitConverter5 {
    static double yardsToFeet(double y){
        return y * 3;
    }
    static double feetToYards(double f){
        return f * 0.333333;
    }
    static double metersToInches(double m){
        return m * 39.3701;
    }
    static double inchesToMeters(double i){
        return i * 0.0254;
    }
    static double inchesToCm(double i){
        return i * 2.54;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(yardsToFeet(v));
        System.out.println(feetToYards(v));
        System.out.println(metersToInches(v));
        System.out.println(inchesToMeters(v));
        System.out.println(inchesToCm(v));
        sc.close();
    }
}