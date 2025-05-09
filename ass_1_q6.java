package assignment1;

import java.util.*;

public class ass_1_q6 {
    static boolean isPath(int[][] graph, int src, int dest, boolean[] visited) {
        if (src == dest) return true;

        visited[src] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[src][i] == 1 && !visited[i]) {
                if (isPath(graph, i, dest, visited)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0},
            {1, 0, 1, 1},
            {0, 1, 0, 0},
            {0, 1, 0, 0}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();
        System.out.print("Enter destination vertex: ");
        int dest = sc.nextInt();

        boolean[] visited = new boolean[graph.length];
        if (isPath(graph, src, dest, visited)) {
            System.out.println("Path exists between " + src + " and " + dest);
        } else {
            System.out.println("No path exists between " + src + " and " + dest);
        }
    }
}
