package org.edu.getjavajob.lesson09;

import java.util.*;

/**
 * @author Alex
 * @since 28.09.14
 */
public class Generics {
    public static <T> void filter(List<T> list, Predicate<T> p, Function<T, T> f) {
        for (ListIterator<T> iterator = list.listIterator(); iterator.hasNext(); ) {
            T next = iterator.next();

            if (p.matches(next)) {
                iterator.set(f.apply(next));
            }
        }
        //O (N)
    }

    public interface Predicate<T> {
        boolean matches(T o);
    }

    public interface Function<F, T> {
        F apply(T t);
    }

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>(Arrays.asList("abcd", "acd", "bd"));

        filter(strings, new Predicate<String>() {
                    @Override
                    public boolean matches(String o) {
                        return o.contains("a");
                    }
                }, new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                }
        );
        System.out.println(strings);
    }
}
