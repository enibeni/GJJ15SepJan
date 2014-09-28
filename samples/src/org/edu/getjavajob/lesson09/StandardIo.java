package org.edu.getjavajob.lesson09;

import java.io.*;

/**
 * @author Alex
 * @since 28.09.14
 */
public class StandardIo {
    public static void main2(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        try {
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                System.err.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        for(;;) {
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            System.out.flush();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
            System.err.flush();
        }

    }
}
