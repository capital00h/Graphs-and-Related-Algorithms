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
	

	
	 public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		System.out.print(source+" ");
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
			PrintStack(stack);
		}
		
		return false;
	}
	
	 public static void PrintStack(Stack<Integer> s)
	 {
	   Stack<Integer> temp = new Stack<Integer>();
	    
	   while (s.empty() == false)
	   {
	     temp.push(s.peek());
	     s.pop();
	   }  
	  
	   while (temp.empty() == false)
	   {
	     int t = temp.peek();
	     System.out.print(t + " ");
	     temp.pop();
	  
	     // To restore contents of
	     // the original stack.
	     s.push(t); 
	   }
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
		
		System.out.println("possible " + Graph.dfsStack(source, destination));
	
	
	}

}
