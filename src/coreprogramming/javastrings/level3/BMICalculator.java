package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class BMICalculator {

    static String bmiStatus(double bmi) {

        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    static String[][] calculate(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100) / 100.0;

            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = bmiStatus(bmi);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] res = calculate(data);

        System.out.println("Weight Height BMI Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(res[i][0]+" "+res[i][1]+" "+res[i][2]+" "+res[i][3]);
        }

        sc.close();
    }
}