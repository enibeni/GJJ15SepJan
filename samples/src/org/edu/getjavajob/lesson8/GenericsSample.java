package org.edu.getjavajob.lesson8;

import sun.management.resources.agent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Alex
 * @since 26.09.14
 */
public class GenericsSample {
    public static void main(String[] args) {
        Arrays.asList("1", "2");

        genericMethod("10");

        new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        }   ;



    }

    public static <T> T genericMethod(String s) {
        System.out.println(s);
        return (T) s;
    }
}
