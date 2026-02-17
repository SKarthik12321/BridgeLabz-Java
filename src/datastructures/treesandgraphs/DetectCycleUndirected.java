package datastructures.treesandgraphs;

import java.util.*;

class DetectCycleUndirected {

    static boolean dfs(int n, int p, List<List<Integer>> g, boolean[] vis) {
        vis[n] = true;
        for (int nb : g.get(n)) {
            if (!vis[nb]) {
                if (dfs(nb, n, g, vis)) return true;
            } else if (nb != p) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 3;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) g.add(new ArrayList<>());

        g.get(0).add(1); g.get(1).add(0);
        g.get(1).add(2); g.get(2).add(1);
        g.get(2).add(0); g.get(0).add(2);

        System.out.println(dfs(0, -1, g, new boolean[v]));
    }
}