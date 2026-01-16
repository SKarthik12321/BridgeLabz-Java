package CoreProgramming.ProgrammingElements.level2;
import java.util.*;
public class TravelComputationIp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter fromCity : ");
        String fromCity = sc.nextLine();
        System.out.print("Enter viaCity : ");
        String viaCity = sc.nextLine();
        System.out.print("Enter toCity : ");
        String toCity = sc.nextLine();
        System.out.print("Enter distances fromToVia : ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distances viaToFinalCity : ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time taken for fromToVia : ");
        double timeTakenFromToVia = sc.nextDouble();
        System.out.print("Enter time taken for viaToFinalCity : ");
        double timeTakenViaToFinalCity = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeTakenFromToVia + timeTakenViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is "
                + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
        sc.close();
    }
}
