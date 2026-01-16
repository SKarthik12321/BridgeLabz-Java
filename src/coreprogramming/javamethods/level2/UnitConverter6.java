package CoreProgramming.JavaMethods.level2;

import java.util.*;

public class UnitConverter6 {
    static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
    static double celsiusToFahrenheit(double c){
        return (c * 9 / 5) + 32;
    }
    static double poundsToKg(double p){
        return p * 0.453592;
    }
    static double kgToPounds(double k){
        return k * 2.20462;
    }
    static double gallonsToLiters(double g){
        return g * 3.78541;
    }
    static double litersToGallons(double l){
        return l * 0.264172;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(fahrenheitToCelsius(v));
        System.out.println(celsiusToFahrenheit(v));
        System.out.println(poundsToKg(v));
        System.out.println(kgToPounds(v));
        System.out.println(gallonsToLiters(v));
        System.out.println(litersToGallons(v));
        sc.close();
    }
}