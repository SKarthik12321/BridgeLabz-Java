package CoreProgramming.JavaMethods.level1;

import java.util.*;

public class Trigonometry {
    static double[] calculate(double angle){
        double r = Math.toRadians(angle);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double[] r = calculate(a);
        System.out.println(r[0]);
        System.out.println(r[1]);
        System.out.println(r[2]);
        sc.close();
    }
}