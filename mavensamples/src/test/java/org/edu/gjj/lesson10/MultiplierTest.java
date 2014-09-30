package org.edu.gjj.lesson10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alex
 * @since 30.09.14
 */
public class MultiplierTest {
    @Test
    public void testMultiply1() throws Exception {
        assertEquals(1, Multiplier.multiply(1, 1));
    }
    @Test
    public void testMultiply2() throws Exception {
        assertEquals(2, Multiplier.multiply(1, 2));
    }
    @Test
    public void testMultiply3() throws Exception {
        assertEquals(-60, Multiplier.multiply(-5, 12));
    }
}
