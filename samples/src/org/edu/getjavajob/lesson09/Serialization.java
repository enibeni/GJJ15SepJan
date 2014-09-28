package org.edu.getjavajob.lesson09;

import java.io.*;

/**
 * @author Alex
 * @since 28.09.14
 */
public class Serialization {


    public static void main2(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.dat"));

        oos.writeObject(new Person("Ivanov", 10));

        oos.close();
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.dat"));

        Object o = ois.readObject();

        System.out.println(o);
    }

}
