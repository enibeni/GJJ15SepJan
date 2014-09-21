package org.edu.getjavajob.lesson6;

import java.util.*;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Sample3 {
    public static void main1(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList("a", "b", "f", "c", "d"));
        System.out.println(set.contains("d"));
        System.out.println(set.contains("f"));

        System.out.println("-------");
        for (String s : set) {
            System.out.println(s + " hashCode =" + s.hashCode() );
        }

    }

    public static void main(String[] args) {
        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("Apple", "Яблоко");
        dictionary.put("Apple2", "Яблоко2");
        dictionary.put("Apple1", "Яблоко1");

        System.out.println(dictionary.get("Apple"));

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

}
