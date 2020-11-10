import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DAGTest {

	@Test
	public void testLCAforEmpty() {
		DAG lca = new DAG(10);
		assertEquals("Testing LCA is -1", -1, lca.findLCA(1, 2));
	}

}
