package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class StudentGrade {

    static int[][] generateMarks(int n) {

        int[][] m = new int[n][3];

        for (int i = 0; i < n; i++) {
            m[i][0] = (int)(Math.random()*100);
            m[i][1] = (int)(Math.random()*100);
            m[i][2] = (int)(Math.random()*100);
        }

        return m;
    }

    static String grade(double p) {

        if (p >= 90) return "A";
        if (p >= 75) return "B";
        if (p >= 60) return "C";
        if (p >= 40) return "D";
        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        System.out.println("P C M Total Avg % Grade");

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = Math.round(avg * 100) / 100.0;

            System.out.println(
                    marks[i][0] + " " +
                            marks[i][1] + " " +
                            marks[i][2] + " " +
                            total + " " +
                            avg + " " +
                            per + " " +
                            grade(per)
            );
        }

        sc.close();
    }
}
