package JavaMethods.level3;

public class NumberChecker2 {

    static int[] digits(int n) {
        int c = String.valueOf(n).length();
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    public static void main(String[] args) {
        int n = 21;
        int[] d = digits(n);
        System.out.println("Sum: " + sum(d));
        System.out.println("Sum of Squares: " + sumSquares(d));
        System.out.println("Harshad: " + isHarshad(n, d));
    }
}
