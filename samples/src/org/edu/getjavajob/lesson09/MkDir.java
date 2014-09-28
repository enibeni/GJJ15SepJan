package org.edu.getjavajob.lesson09;

import java.io.File;

/**
 * @author Alex
 * @since 28.09.14
 */
public class MkDir {
    public static void main(String[] args) {
        File f = new File("reousrces/resouces2");
//        File f = new File(new File("reources"), "resouces2");

        if(!f.exists()) {
            System.out.println(f.mkdirs());
        } else {
            System.out.println("already exists");
        }
    }
}
