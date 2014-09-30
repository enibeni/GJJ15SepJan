package org.edu.gjj.lesson10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alex
 * @since 30.09.14
 */
public class BrokenConcurencyTest {
    @Test
    public void testIncrementNTimes() throws Exception {
        long start = System.currentTimeMillis();
        assertEquals(10 * BrokenConcurency.TIMES, BrokenConcurency.intcrementInThreads(10));
        System.out.println(System.currentTimeMillis() - start);
    }
}
