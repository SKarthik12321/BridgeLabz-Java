package CoreProgramming.JavaMethods.level2;

public class RandomStats {
    static int[] generate(int n){
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = (int)(Math.random()*9000)+1000;
        return a;
    }

    static double[] calculate(int[] a){
        int sum = 0, min = a[0], max = a[0];
        for(int x : a){
            sum += x;
            if(x < min) min = x;
            if(x > max) max = x;
        }
        return new double[]{ (double)sum/a.length, min, max };
    }

    public static void main(String[] args){
        int[] a = generate(5);
        double[] r = calculate(a);
        System.out.println(r[0]);
        System.out.println(r[1]);
        System.out.println(r[2]);
    }
}