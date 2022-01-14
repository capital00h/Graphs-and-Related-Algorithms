package algorithm_Assignment01;

import java.util.*;

public class Graph_DFS{
	private LinkedList<Integer>adj[];
	public Graph_DFS(int v) { //created required Graph 
		adj= new LinkedList[v];
		for (int i=0;i<v;++i) {
			adj[i]= new LinkedList<Integer>(); //Enter number of vertices of graph
		}
	}
	public void addedge(int source , int destination) { //Add edge b|w source and destination
		adj[source].add(destination);
		adj[destination].add(source);
	}
	private boolean dfsUtil (int source , int destination , boolean visited[]) {
		if (source == destination ) return true;
		for (int neighbor :adj[source] ) {
			if (!visited[neighbor]) {
				visited[neighbor]=true;
				boolean isConnected=dfsUtil(source, destination, visited);
				if (isConnected) return true;
				
				
			}
		}
		return false;
	}
	public boolean dfs(int source , int destination ) {
		boolean visited[]=new boolean[adj.length];
		visited[source]=true;
		return dfsUtil(source, destination, visited);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of vertices");
		int v= sc.nextInt();
		System.out.println("Enter number of edges");
		int e=sc.nextInt();
		
		Graph_DFS Graph = new Graph_DFS(v); // created an object of graph named graph 
		System.out.println("Enter "+e+" edges"); //prompts user to enter e number of edges
		for (int i=0; i<e;++i) { //loop which runs e times to take source and destination of each
			                    // edge
			System.out.println("Enter source and Destination  of "+(i+1)+" th edge");
			int source =sc.nextInt();
			
			int destination =sc.nextInt();
			Graph.addedge(source, destination);// use addedge to add edge between source and 
			                                   // destination
			
		}
		System.out.println("Enter destination ");
		int destination=sc.nextInt();
		System.out.println("Enter source");
		int source=sc.nextInt();
		System.out.println("Possible? "+Graph.dfs(source, destination));
	
	
	}

}
