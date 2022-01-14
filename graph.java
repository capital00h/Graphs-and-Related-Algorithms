package algorithm_Assignment01;
import java. util.*;
public class graph {
	private LinkedList<Integer>adj[];
	public graph(int v) { //created required Graph 
		adj= new LinkedList[v];
		for (int i=0;i<v;++i) {
			adj[i]= new LinkedList<Integer>(); //Enter number of vertices of graph
		}
	}
	public void addedge(int source , int destination) { //Add edge b|w source and destination
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public int bfs (int source , int destination ) { // breadth first search
		boolean visited[]=new boolean [adj.length];
		int parent[]=new int[adj.length];
		Queue<Integer>q=new LinkedList<>(); //Implemented Queue as Linked list
		q.add(source); // Added source in queue
		parent[source]=-1; // initial value of  parent source is -1
		visited[source]=true; // make the source vistied =True 
		while (!q.isEmpty()) { // loop will work till queue is not empty
			int cur =q.poll(); // pull the first element of queue 
			if (cur==destination) break;
			for (int neighbour:adj[cur]) { // for every neighbor of curent vertex 
				if (!visited[neighbour]) { // if not visited 
					visited[neighbour]=true; // intialize them to true 
					q.add(neighbour);  // add them to queue 
					parent[neighbour]=cur;// make the curent as their parent
				}
			}
		}
		int cur = destination ;
		int distance=0;
		while (parent[cur]!=-1) {
			System.out.print(cur+" => ");
			cur =parent[cur];
			distance++;
		}
		
		return distance;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of vertices");
		int v= sc.nextInt();
		System.out.println("Enter number of edges");
		int e=sc.nextInt();
		
		graph Graph = new graph(v); // created an object of graph named graph 
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
		int distance=Graph.bfs(source, destination);
		System.out.println("Minimum distance is "+distance);
		

	}

}
