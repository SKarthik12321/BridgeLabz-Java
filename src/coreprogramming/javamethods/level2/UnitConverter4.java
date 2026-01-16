package CoreProgramming.JavaMethods.level2;

import java.util.*;

public class UnitConverter4 {
    static double kmToMiles(double km){
        return km * 0.621371;
    }
    static double milesToKm(double miles){
        return miles * 1.60934;
    }
    static double metersToFeet(double m){
        return m * 3.28084;
    }
    static double feetToMeters(double f){
        return f * 0.3048;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        System.out.println(kmToMiles(value));
        System.out.println(milesToKm(value));
        System.out.println(metersToFeet(value));
        System.out.println(feetToMeters(value));
        sc.close();
    }
}