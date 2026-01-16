package CoreProgramming.ProgrammingElements.level2;

import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit : ");
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        sc.close();
    }
}
