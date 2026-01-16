package JavaMethods.level3;

public class FootballTeamHeights {

    static int[] generateHeights() {
        int[] h = new int[11];
        for (int i = 0; i < h.length; i++)
            h[i] = (int)(Math.random() * 101) + 150;
        return h;
    }

    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    static double mean(int[] a) {
        return (double) sum(a) / a.length;
    }

    static int shortest(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }

    static int tallest(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights:");
        for (int x : heights) System.out.print(x + " ");
        System.out.println("\nShortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
}