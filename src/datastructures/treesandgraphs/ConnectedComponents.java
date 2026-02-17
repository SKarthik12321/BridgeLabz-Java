package datastructures.treesandgraphs;

import java.util.*;

class ConnectedComponents {

    static void dfs(int n, List<List<Integer>> g, boolean[] vis) {
        vis[n] = true;
        for (int nb : g.get(n))
            if (!vis[nb]) dfs(nb, g, vis);
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) g.add(new ArrayList<>());

        g.get(0).add(1); g.get(1).add(0);
        g.get(3).add(4); g.get(4).add(3);

        boolean[] vis = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(i, g, vis);
                count++;
            }
        }
        System.out.println(count);
    }
}