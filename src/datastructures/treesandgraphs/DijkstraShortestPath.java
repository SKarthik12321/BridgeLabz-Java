package datastructures.treesandgraphs;

import java.util.*;

class DijkstraShortestPath {

    static class Edge {
        int v, w;
        Edge(int v, int w) { this.v = v; this.w = w; }
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<Edge>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) g.add(new ArrayList<>());

        g.get(0).add(new Edge(1, 2));
        g.get(0).add(new Edge(2, 4));
        g.get(1).add(new Edge(2, 1));
        g.get(1).add(new Edge(3, 7));
        g.get(2).add(new Edge(4, 3));

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int d = cur[1];

            if (d > dist[node]) continue;

            for (Edge e : g.get(node)) {
                if (dist[node] + e.w < dist[e.v]) {
                    dist[e.v] = dist[node] + e.w;
                    pq.add(new int[]{e.v, dist[e.v]});
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
