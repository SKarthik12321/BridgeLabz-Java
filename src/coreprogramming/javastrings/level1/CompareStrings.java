package CoreProgramming.JavaStrings.level1;

import java.util.*;

public class CompareStrings {
    static boolean CompareStringCharAt(String s1, String s2){
        if (s1.length () != s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = sc.next();
        System.out.print("Enter String 2 : ");
        String s2 = sc.next();
        boolean r1 = CompareStringCharAt(s1,s2);
        boolean r2 = s1.equals(s2);
        System.out.println("The charAt result is " + r1 + " and using built-in functions result is " + r2);
    sc.close();
    }
}
