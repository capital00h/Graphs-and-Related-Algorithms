package algorithm_Assignment01;
import java.util.*;
import java.io.*;
public class top_graph {
	
    private int V;

    private ArrayList<ArrayList<Integer> > adj;

    
    top_graph(int v) //inputs vertex into the graph
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }

    
    void addEdge(int v, int w) { //adds edges into the graph
    	adj.get(v).add(w);
    	} 

    void topologicalSortUtil(int v, boolean visited[],Stack<Integer> stack)
    {                                // topological sort utilities
        visited[v] = true;
        Integer i;

        
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        
        stack.push(new Integer(v));
    }

    
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;        
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }

   
    public static void main(String args[])
    {
    	Scanner sc= new Scanner (System.in);
    	int v,e;
    	System.out.println("Enter number of vertex");
    	v=sc.nextInt();
    	System.out.println("enter number of edges");
    	e=sc.nextInt();
    	
        
        top_graph g = new top_graph(v);
       int source,destination;
       
       System.out.println("Enter source and destination");
         for(int i =0; i<e;++i){
         source=sc.nextInt();
         destination=sc.nextInt();
         g.addEdge(source,destination); 
         }

        System.out.println("Following is a Topological " + "sort of the given graph");
        g.topologicalSort();

	}

}
