package org.edu.getjavajob.lesson09;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alex
 * @since 28.09.14
 */
public class ByteArrayInputStreamSample {
    public static void main(String[] args) throws IOException {
        InputStream bais = new FileInputStream("resources/test.txt");

//        new String()

        int b;

        while((b = bais.read()) != -1) {
            System.out.println(b);
        }
    }
}
