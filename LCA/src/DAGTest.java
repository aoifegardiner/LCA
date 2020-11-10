import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DAGTest {

	@Test
	public void testLCAforEmpty() {
		DAG lca = new DAG(10);
		assertEquals("Testing LCA is -1", -1, lca.findLCA(1, 2));
	}
	
	@Test
	public void testDirectedGraph(){
		DAG newDAG = new DAG(10);
		newDAG.addEdge(1, 2);
		newDAG.addEdge(1, 3);
		newDAG.addEdge(3, 4);
		newDAG.addEdge(4, 5);
		newDAG.addEdge(4, 6);

		assertEquals("", 5, newDAG.edges());
		assertEquals("", 10, newDAG.vertices());
		String ans = "[5, 6]";
		assertEquals("",ans, newDAG.adj(4).toString());
	}
	
	@Test
	public void testCycle(){
		DAG newDAG = new DAG(20);
		newDAG.addEdge(0, 1);
		newDAG.addEdge(1, 2);
		newDAG.addEdge(2, 0);
		newDAG.addEdge(2, 3);
		newDAG.addEdge(3, 4);

		newDAG.findCycle(0);
		assertTrue(newDAG.hasCycle());
	}
	
	@Test
	public void testAcyclicGraph(){
		DAG newDAG = new DAG(5);
		newDAG.addEdge(0, 1);
		newDAG.addEdge(1, 2);
		newDAG.addEdge(2, 3);
		assertFalse(newDAG.hasCycle());
	}
	
	@Test
	public void testAddEdge(){
		DAG newDAG = new DAG(5);
		newDAG.addEdge(1, 2);
		newDAG.addEdge(-3, -4);
		newDAG.addEdge(2, 3);	
		assertEquals(2, newDAG.edges());
	}
		
	@Test
	public void testinDegree(){
		DAG newDAG= new DAG(5);
		assertEquals("", -1, newDAG.indegree(-3));
	}

	@Test
	public void testOutDegree(){
		DAG newDAG = new DAG(5);
		assertEquals("", -1, newDAG.outdegree(8));	
	}
}
