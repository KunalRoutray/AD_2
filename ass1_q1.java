

 




import java .util.*;

public class ass1_q1
{
	 public static void  qs1(int[][]graph, int start, int vertices)
	{  
		 boolean[] visited= new boolean [vertices];
		 int []queue=new int [vertices];
		 int front=0,rear=0;
		 visited[start]=true;
		 queue[rear++]=start;
		 while (front<rear)
		 {    
			 int current = queue[front++];
			 System.out.print(current +" ");
			 for ( int i=0;i< vertices;i++)
			 {
				 if( graph[current][i]==1 &&!visited[i])
				 {
					 visited[i]= true;
					 queue[rear++]=i;
				 }
			 }
		
		 }	 
	}	 
		public static void main(String [] args)	
		{
			int vertices=6;
			int[][] graph= {
					{0,1,1,0,0,0},
					{0,1,1,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0}};
			    qs1(graph ,0,vertices);
		}
		
		
	

}








