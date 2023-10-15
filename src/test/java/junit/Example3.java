package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Example3 {

    @Test
    public void testAssertEquals() {
        assertEquals(64, 2 * 32);
        assertEquals(1 + 1, 2);
    }

    @Test
    public void testAsertTrueFalse() {
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not hello"));
    }

    @Test
    public void testArrayEquals() {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6};
        assertArrayEquals(first, second, "Arrays are not equal");

    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSame() {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        assertSame(c1,c2);
    }

    @Test
    public void testAssertSameForStrings() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);
    }
}
