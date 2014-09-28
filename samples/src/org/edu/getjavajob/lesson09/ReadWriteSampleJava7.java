package org.edu.getjavajob.lesson09;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alex
 * @since 28.09.14
 */
public class ReadWriteSampleJava7 {
    public static void main(String[] args) {
        final File f = new File("resources/sample.txt");

        List<String> lines = new ArrayList<>(Arrays.asList("line 1", "line 2", "line 3"));

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f)))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            writer.close();
        } */
    }

    public static void mainRead(String[] args) {
        final File f = new File("resources/sample.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            reader.close();
        } */

    }
}
