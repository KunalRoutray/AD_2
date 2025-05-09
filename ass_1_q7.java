package assignment1;

import java.util.*;

public class ass_1_q7 {
    static void findAllPaths(int[][] graph, int src, int dest, boolean[] visited, List<Integer> path) {
        visited[src] = true;
        path.add(src);

        if (src == dest) {
            System.out.println(path);
        } else {
            for (int i = 0; i < graph.length; i++) {
                if (graph[src][i] == 1 && !visited[i]) {
                    findAllPaths(graph, i, dest, visited, path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited[src] = false;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {0, 1, 1, 0}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();
        System.out.print("Enter destination vertex: ");
        int dest = sc.nextInt();

        boolean[] visited = new boolean[graph.length];
        List<Integer> path = new ArrayList<>();
        System.out.println("All paths from " + src + " to " + dest + ":");
        findAllPaths(graph, src, dest, visited, path);
    }
}
