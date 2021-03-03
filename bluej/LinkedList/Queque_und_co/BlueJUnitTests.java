

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse BlueJUnitTests.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BlueJUnitTests
{
    /**
     * Konstruktor fuer die Test-Klasse BlueJUnitTests
     */
    public BlueJUnitTests()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void stacktest() {
        Stack<Integer> stack1 = new Stack<Integer>();
        assertEquals(true, stack1.isEmpty());
        stack1.pop();
        stack1.push(5);
        stack1.push(8);
        assertEquals(8, stack1.peek().intValue());
        stack1.pop();
        assertEquals(5, stack1.peek().intValue());
        stack1.pop();
        assertNull(stack1.peek());
    }
}

