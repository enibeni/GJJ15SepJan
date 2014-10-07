package lesson13;

import java.util.*;

/**
 * @author Alex
 * @since 07.10.14
 */
public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new TreeMap<>();
        dictionary.put("a", 10);
        dictionary.put("b", 9);
        dictionary.put("c", 1);
        dictionary.put("f", 7);

        print(dictionary); //c=1 f=7 b=9 a=10
    }



    public static void print(final Map<String, Integer> dictionary) {
        //prints map entries order by value

        Map<String, Integer> sorted = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return dictionary.get(o1).compareTo(dictionary.get(o2));
            }
        });
        sorted.putAll(dictionary);

        System.out.println(sorted);
    }
}
