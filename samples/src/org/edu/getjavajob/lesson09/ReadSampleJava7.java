package org.edu.getjavajob.lesson09;

import java.io.*;

/**
 * @author Alex
 * @since 28.09.14
 */
public class ReadSampleJava7 {
    public static void main(String[] args) {
        final File f = new File("resources/sample.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
