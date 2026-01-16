package CoreProgramming.JavaMethods.level1;

import java.util.*;

public class Chocolates {
    static int[] distribute(int chocolates, int children){
        return new int[]{chocolates / children, chocolates % children};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] r = distribute(c, n);
        System.out.println(r[0]);
        System.out.println(r[1]);
        sc.close();
    }
}
