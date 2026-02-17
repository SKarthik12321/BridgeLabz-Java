package datastructures.treesandgraphs;

import java.util.*;

class GraphBFS {
    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) g.add(new ArrayList<>());

        g.get(0).add(1); g.get(1).add(0);
        g.get(0).add(2); g.get(2).add(0);
        g.get(1).add(3); g.get(3).add(1);

        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int n = q.poll();
            System.out.print(n + " ");
            for (int nb : g.get(n)) {
                if (!vis[nb]) {
                    vis[nb] = true;
                    q.add(nb);
                }
            }
        }
    }
}