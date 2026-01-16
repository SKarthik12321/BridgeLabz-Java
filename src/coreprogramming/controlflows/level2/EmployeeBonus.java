package CoreProgramming.ControlFlows.level2;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5)
            System.out.println(salary * 0.05);
        else
            System.out.println(0);

        sc.close();
    }
}
