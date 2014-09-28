package org.edu.getjavajob.lesson09;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alex
 * @since 28.09.14
 */
public class ReadWriteSample {
    public static void main(String[] args) {

        final File f = new File("resources/sample.txt");

        List<String> lines = new ArrayList<>(Arrays.asList("line 1", "line 2", "line 3"));

        PrintWriter w = null;
        try {
            w = new PrintWriter(new BufferedWriter(new FileWriter(f)));

            for (String line : lines) {
                w.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(w != null) {
                w.close();
            }
        }
    }
}
