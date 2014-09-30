package org.edu.gjj.lesson10;

import java.io.File;

/**
 * @author Alex
 * @since 30.09.14
 */
public class MkdirExample {
    public static void main(String[] args) {
        File f = new File("testdir");
        MkdirExample.class.getResourceAsStream("test.txt");
        File f2 = new File("testditr1/testdir");
        if(!f.exists()) {
            f.mkdir();

        }
        if(!f2.exists()) {
            f2.mkdirs();

        }

    }
}
