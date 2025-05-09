package assignment2;


public class ass_2_q4 {
    static int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    static void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        if (xset != yset)
            parent[xset] = yset;
    }

    static boolean isCycle(int[][] edges, int V) {
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = -1;

        for (int[] edge : edges) {
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);

            if (x == y)
                return true;

            union(parent, x, y);
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {0, 3}  // introduces a cycle
        };

        if (isCycle(edges, V))
            System.out.println("Graph contains a cycle");
        else
            System.out.println("Graph does not contain a cycle");
    }
}
