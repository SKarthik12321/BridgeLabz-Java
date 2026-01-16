package CoreProgramming.ControlFlows.level1;

import java.util.*;

public class SumUntilBreak {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double value;

        System.out.println("Enter the values : ");
        while(true){
            value = sc.nextDouble();
            if(value <= 0)
                break;
            total += value;
        }
        System.out.println(total);
        sc.close();
    }
}
