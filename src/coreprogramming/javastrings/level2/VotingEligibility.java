package CoreProgramming.JavaStrings.level2;

import java.util.Scanner;

public class VotingEligibility {

    static int[] generateAges(int n) {

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 100);
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < n; i++) {
            boolean canVote = ages[i] >= 18;
            System.out.println(ages[i] + "\t" + canVote);
        }

        sc.close();
    }
}
