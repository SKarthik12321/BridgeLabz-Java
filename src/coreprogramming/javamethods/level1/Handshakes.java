package CoreProgramming.JavaMethods.level1;

import java.util.*;

public class Handshakes {
    static int calculateHandshakes(int n){
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateHandshakes(n));
        sc.close();
    }
}