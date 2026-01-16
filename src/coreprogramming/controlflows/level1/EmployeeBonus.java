package CoreProgramming.ControlFlows.level1;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();
        System.out.print("Enter year :");
        int years = sc.nextInt();

        if (years > 5)
            System.out.println(salary * 0.05);
        else
            System.out.println(0);
        sc.close();
    }
}
