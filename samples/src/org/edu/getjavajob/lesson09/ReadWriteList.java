package org.edu.getjavajob.lesson09;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Alex
 * @since 28.09.14
 */
public class ReadWriteList {
    public static void main(String[] args) {
        File f = new File("resources");

        if(f.isDirectory()) {
            String[] names = f.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            });

            for (String s : names) {
                System.out.println(s);
            }
        } else {
            System.out.println(f.getAbsolutePath());
        }

    }
}
