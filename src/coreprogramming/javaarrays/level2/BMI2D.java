package CoreProgramming.JavaArrays.level2;

import java.util.Scanner;

class BMI2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {

            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(
                    personData[i][1] + " " +
                            personData[i][0] + " " +
                            personData[i][2] + " " +
                            weightStatus[i]
            );
        }

        sc.close();
    }
}