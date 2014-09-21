package org.edu.getjavajob.lesson6;

import java.util.*;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Sample1 {
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1); //autoboxing

        list.add(new Integer(1)); //unnecessary

        int a = list.get(0);//autounboxing
    }

    public static void main2(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");

        System.out.println(map.get("key1")); // value1
    }

    public static void main3(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        // Runs significantly faster, but you can’t
        // construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
        // list.add(21); // Runtime error because the
        // underlying array cannot be resized.
    }
}
