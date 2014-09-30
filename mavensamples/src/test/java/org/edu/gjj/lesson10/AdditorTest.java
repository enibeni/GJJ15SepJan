package org.edu.gjj.lesson10;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Alex
 * @since 30.09.14
 */
public class AdditorTest {
    @Test
    public void testAddCase1() throws Exception {
        Assert.assertEquals(3, Additor.add(1, 2));
    }

    @Test
    public void testAddCase2() throws Exception {
        Assert.assertEquals(-1, Additor.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAddCase3() throws Exception {
        Assert.assertEquals(-4, Additor.add(-1, -3));
    }
}
