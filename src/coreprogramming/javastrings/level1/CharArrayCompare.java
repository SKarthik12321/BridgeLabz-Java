package CoreProgramming.JavaStrings.level1;

import java.util.*;

public class CharArrayCompare {

    static char[] getCharacters(String s){
        char arr[] = new char[s.length()];
        for(int i=0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    static boolean compare(char[] a, char[] b){
        if(a.length != b.length)
            return false;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Without toCharArray method : ");
        char[] getUser = getCharacters(text);
        System.out.println(getUser);

        System.out.print("With toCharArray method : ");
        char[] builtin = text.toCharArray();
        System.out.println(builtin);

        System.out.print("Are both same ? ");
        System.out.print(compare(getUser, builtin));

        sc.close();
    }
}