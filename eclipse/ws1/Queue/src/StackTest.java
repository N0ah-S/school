import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void test() {
		
		Stack<String> s = new Stack<>();
		
		assertEquals(null, s.pop());
		
		s.push("A");
		s.push("B");
		
		assertEquals("B", s.pop());
		
		s.push("C");
		
		assertEquals("C", s.pop());
		assertEquals("A", s.pop());
		assertEquals(null, s.pop());
	}

}
