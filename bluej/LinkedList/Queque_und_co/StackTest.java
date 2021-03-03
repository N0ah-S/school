

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    public StackTest() {
        
    }
    
    @Test
    public void test() {
        
        Stack<String> s = new Stack<String>();
        
//      assertEquals(null, s.pop());
//      
//      s.push("A");
//      s.push("B");
//      
//      assertEquals("B", s.pop());
//      
//      s.push("C");
//      
//      assertEquals("C", s.pop());
//      assertEquals("A", s.pop());
//      assertEquals(null, s.pop());
        
        assertEquals(null, s.peek());
        s.pop();
        
        s.push("A");
        s.push("B");
        
        assertEquals("B", s.peek());
        s.pop();
        
        s.push("C");
        
        assertEquals("C", s.peek());
        s.pop();
        assertEquals("A", s.peek());
        s.pop();
        assertEquals(null, s.peek());
        
        assertEquals(true, s.isEmpty());
    }
}
