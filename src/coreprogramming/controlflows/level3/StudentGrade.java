package CoreProgramming.ControlFlows.level3;

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        if (average >= 90)
            System.out.println("Grade A");
        else if (average >= 75)
            System.out.println("Grade B");
        else if (average >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
        sc.close();
    }
}
