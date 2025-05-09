package assignment2;

import java.util.*;

public class ass_2_q5 {
    static void dfs(int[][] graph, boolean[] visited, int v) {
        visited[v] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    static int[][] transpose(int[][] graph) {
        int[][] transposed = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j < graph.length; j++)
                transposed[j][i] = graph[i][j];
        return transposed;
    }

    static boolean isStronglyConnected(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        dfs(graph, visited, 0);
        for (boolean v : visited)
            if (!v) return false;

        int[][] transposed = transpose(graph);
        visited = new boolean[graph.length];
        dfs(transposed, visited, 0);
        for (boolean v : visited)
            if (!v) return false;

        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 0, 0}
        };

        if (isStronglyConnected(graph))
            System.out.println("Graph is strongly connected");
        else
            System.out.println("Graph is not strongly connected");
    }
}
