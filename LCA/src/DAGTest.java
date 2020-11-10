import static org.junit.Assert.assertEquals;
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
}
