package assignment2;

import java.util.*;

public class ass_2_q2 {
    static int shortestDistance(int[][] graph, int src, int dest) {
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[graph.length];
        boolean[] visited = new boolean[graph.length];

        queue.add(src);
        visited[src] = true;
        distance[src] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == dest) return distance[node];

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    distance[i] = distance[node] + 1;
                }
            }
        }

        return -1; // no path
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();
        System.out.print("Enter destination vertex: ");
        int dest = sc.nextInt();

        int dist = shortestDistance(graph, src, dest);
        if (dist != -1) {
            System.out.println("Shortest distance from " + src + " to " + dest + " is: " + dist);
        } else {
            System.out.println("No path exists between the vertices.");
        }
    }
}
