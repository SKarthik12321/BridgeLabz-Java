package JavaMethods.level3;

public class NumberChecker3 {

    static int[] digits(int n) {
        int c = String.valueOf(n).length();
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static int[] reverse(int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++)
            r[i] = a[a.length - 1 - i];
        return r;
    }

    static boolean equal(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 121;
        int[] d = digits(n);
        System.out.println("Palindrome: " + equal(d, reverse(d)));
    }
}