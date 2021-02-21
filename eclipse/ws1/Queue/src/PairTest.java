import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author noaha
 *
 */
class PairTest {

	@Test
	void test() {
		Pair<String, Integer> p = new Pair<>("W", 6);
		
		assertEquals("W", p.getA());
		assertEquals(6, p.getB());
		
		p.setA("A");
		p.setB(2);
		
		assertEquals("A", p.getA());
		assertEquals(2, p.getB());
		
		
	}

}