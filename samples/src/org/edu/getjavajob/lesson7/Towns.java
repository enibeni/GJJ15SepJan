package org.edu.getjavajob.lesson7;

import java.util.*;

/**
 * @author Alex
 * @since 23.09.14
 */
public class Towns {
    public static void main(String[] args) {
        List<String> towns = new ArrayList<>();

        towns.addAll(Arrays.asList("Moscow", "Aleksin", "Moscoooow"));

        printFirstMatchingStringSort(towns, "M");

    }

    public static void printFirstMatchingStringSort(final List<String> towns, String substring) {
        List<String> towns2 = new ArrayList<>(towns);
        Collections.sort(towns2);

        System.out.println(Collections.binarySearch(towns, substring));

    }

    public static void printFirstMatchingString(List<String> towns, String substring) {
        TreeSet<String> sorted = new TreeSet<>(towns);

        System.out.println(sorted.ceiling(substring));
    }
}
