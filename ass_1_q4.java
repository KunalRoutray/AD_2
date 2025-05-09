package assignment1;

public class ass_1_q4 {
    static void dfsRecursive(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfsRecursive(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {0, 1, 1, 0}
        };
        boolean[] visited = new boolean[graph.length];
        System.out.println("DFS using recursion starting from vertex 0:");
        dfsRecursive(graph, visited, 0);
    }
}
