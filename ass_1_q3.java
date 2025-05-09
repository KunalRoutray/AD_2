package assignment1;

import java.util.*;

public class ass_1_q3 {
    static void dfsUsingStack(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
                for (int i = graph.length - 1; i >= 0; i--) {
                    if (graph[node][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
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
        System.out.println("DFS using stack starting from vertex 0:");
        dfsUsingStack(graph, 0);
    }
}

