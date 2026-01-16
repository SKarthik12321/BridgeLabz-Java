package CoreProgramming.ControlFlows.level1;

import java.util.*;

public class CountDownWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter counter : ");
        int counter = sc.nextInt();

        while(counter >= 1){
            System.out.print(counter + " ");
            counter--;
        }
        sc.close();
    }
}