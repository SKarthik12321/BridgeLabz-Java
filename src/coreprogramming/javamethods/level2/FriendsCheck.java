package CoreProgramming.JavaMethods.level2;

import java.util.*;

public class FriendsCheck {
    static int youngest(int[] age){
        int min = age[0];
        for(int i=1;i<3;i++)
            if(age[i] < min) min = age[i];
        return min;
    }

    static int tallest(int[] h){
        int max = h[0];
        for(int i=1;i<3;i++)
            if(h[i] > max) max = h[i];
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];

        for(int i=0;i<3;i++) age[i] = sc.nextInt();
        for(int i=0;i<3;i++) height[i] = sc.nextInt();

        System.out.println(youngest(age));
        System.out.println(tallest(height));
        sc.close();
    }
}