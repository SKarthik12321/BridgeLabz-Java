package CoreProgramming.JavaStrings.level1;

import java.util.*;

public class SubStringCompare {

    static String BuildSubString(String s, int start, int end){
        String r = "";
        for(int i = start; i < end; i++){
            r = r + s.charAt(i);
        }
        return r;
    }

    static boolean compare(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Enter the start: ");
        int start = sc.nextInt();

        System.out.print("Enter the end: ");
        int end = sc.nextInt();

        String manual = BuildSubString(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("The manual substring is : " + manual + " and using builtin substring is : " + builtin);
        System.out.println("Are both same : " + compare(manual, builtin));

        sc.close();
    }
}
