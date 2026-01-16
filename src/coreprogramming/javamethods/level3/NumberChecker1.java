package JavaMethods.level3;

public class NumberChecker1 {

    static int countDigits(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, d.length);
        return s == n;
    }

    static void largestSecond(int[] d) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) { smax = max; max = x; }
            else if (x > smax && x != max) smax = x;
        }
        System.out.println("Largest: " + max + " Second Largest: " + smax);
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(n, d));
        largestSecond(d);
    }
}