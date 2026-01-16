package JavaMethods.level3;

public class OTPGenerator {

    static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    static boolean unique(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        System.out.println("Unique: " + unique(otps));
    }
}