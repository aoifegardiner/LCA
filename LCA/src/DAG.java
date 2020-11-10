import java.util.ArrayList;

public class DAG {
	
	private int vertices;           	//Number of vertices in this digraph
	private int edges;                 	//Number of edges in this digraph
	private ArrayList<Integer>[] adj;   //adj[v] = adjacency list for vertex v
	private int[] indegree;        		//Indegree[v] = indegree of vertex v
	private boolean marked[];			//Boolean list to track visited vertices
	private boolean stack[];			//Order that vertices were visited
	private boolean hasCycle;			//True if cycle in graph
	
	@SuppressWarnings("unchecked")
	public DAG(int vertices)
	{
		if (vertices < 0) throw new IllegalArgumentException("Must be a positive number of vertices.");
	    this.vertices = vertices;
	    this.edges = 0;
	    indegree = new int[vertices];	
	    marked = new boolean[vertices];
	    stack = new boolean[vertices];
	    adj = (ArrayList<Integer>[]) new ArrayList[vertices];
	    for (int v = 0; v < vertices; v++) {
	        adj[v] = new ArrayList<Integer>();
	    }    
	}
}
	
