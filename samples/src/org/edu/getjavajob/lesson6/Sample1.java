package org.edu.getjavajob.lesson6;

import java.util.*;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Sample1 extends ArrayList {
    private static class Sample1Inner extends LinkedList {
//        List list =new ArrayList<>();
    }


    public static void main7(String[] args) {
        String s1, s2;
    }

    //assing multiple elements
    public static void main(String[] args) {
//        Collection<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.iterator();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.addAll(Arrays.asList("1", "2", "3", "4"));//1



        for (String s : list) {
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
            String next = iterator.next();
            iterator.remove();
            iterator.set(next.toUpperCase());
        }

        System.out.println(list);

        Collections.addAll(list, "1", "2", "3");
//        Collections.addAll(list, Arrays.<String>asList("1", "2", "3", "4")); //TODO: ???

        Arrays.asList(new String[] {"1", "2", "3", "4"});



        System.out.println(Arrays.toString(new String[][]{
                 {"1", "2"},
                 {"3", "4"}}));

        //intializing double dimension array

        int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[10];

        }

    }

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
