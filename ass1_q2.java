




public class ass1_q2
{

    int[][] adjMatrix;  
   
   public ass1_q2(int vertices) 
   {
       adjMatrix = new int[vertices][vertices];  
   }

   
   public void addEdge(int source, int destination) 
   {
       adjMatrix[source][destination] = 1; 
       adjMatrix[destination][source] = 1; 
   }

  
   public void dfs(int vertex, boolean[] visited) {
       visited[vertex] = true;  
       System.out.print(vertex + " "); 
       
       
       for (int i = 0; i < adjMatrix.length; i++) {
           if (adjMatrix[vertex][i] == 1 && !visited[i]) {
               dfs(i, visited);  
           }
       }
   }

   public static void main(String[] args) {
       ass1_q2 graph = new ass1_q2(5);  

       
       graph.addEdge(0, 1);
       graph.addEdge(0, 2);
       graph.addEdge(1, 3);
       graph.addEdge(1, 4);

      
       System.out.print("DFS starting from vertex 0: ");
       graph.dfs(0, new boolean[5]);
   }
}