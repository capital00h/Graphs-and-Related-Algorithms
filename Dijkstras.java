package algorithm_Assignment01;
import java.util.*;
public class Dijkstras {
	private static void Dijkstras(int[][]adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean visited[]=new boolean[v];
		int distance[]=new int[v];
		distance[0]=0;
		for (int i=1;i<v;++i) {
			distance[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		for (int i=0;i<v-1;++i) {
			//find vertex with minimum distance 
			int minVertex=findMinVertex(distance,visited);
			visited[minVertex]=true;
			// Explore Neighbors
			for (int j=0;j<v;j++) {
				if(adjacencyMatrix[minVertex][j]!=0&&!visited[j] && 
						distance[minVertex]!=Integer.MAX_VALUE) {
					int newdist= distance[minVertex]+adjacencyMatrix[minVertex][j];
					if (newdist<distance[j]) {
						distance[j]=newdist;
					}
				}
			}
			
		}
		for (int i =0;i<v;++i) {
			System.out.println(i+" "+distance[i]);
		}
		
	}
	private static int findMinVertex(int[] distance, boolean visited[]) {
		
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for (int i=0;i<distance.length;++i) {
			if (visited[i]==false && distance[i]<=min){
				min=distance[i];
				min_index=i;
				
				
			}
		
		}
		return min_index;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of vertex and Edges ");
		int v = sc.nextInt();
		int e=sc.nextInt();
		int adjacencyMatrix[][]=new int[v][v];
		for (int i =0;i<e;++i) {
			System.out.println("Enter Source Destination weight ");
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight =sc.nextInt();
			adjacencyMatrix[source][destination]=weight;
			
			
		}
		Dijkstras(adjacencyMatrix);
		

	}

}
