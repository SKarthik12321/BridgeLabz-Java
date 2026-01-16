package JavaMethods.level3;

public class LineEquation {

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double[] equation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double[] e = equation(2, 4, 6, 8);
        System.out.println("Distance: " + distance(2,4,6,8));
        System.out.println("y = " + e[0] + "x + " + e[1]);
    }
}