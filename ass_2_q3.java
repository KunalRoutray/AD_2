package assignment2;

import java.util.*;

public class ass_2_q3 {
    static boolean isCyclic(int v, List<List<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor] && isCyclic(neighbor, adj, visited, recStack))
                return true;
            else if (recStack[neighbor])
                return true;
        }

        recStack[v] = false;
        return false;
    }

    public static void main(String[] args) {
        int vertices = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0); // back edge creates a cycle
        adj.get(2).add(3);

        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && isCyclic(i, adj, visited, recStack)) {
                System.out.println("Graph contains a cycle");
                return;
            }
        }

        System.out.println("Graph does not contain a cycle");
    }
}

