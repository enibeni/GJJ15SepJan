package org.edu.getjavajob.lesson8;

import java.util.*;

/**
 * @author Alex
 * @since 26.09.14
 */
public class Functions2 {
    public enum Figure {
        BISHOP(1, "Конь"),
        KING(1, "Слон"),
        PESHKA(2, "");

        Map<String, Set<String>> graph;

        private final int gender;
        private final String translation;


        Figure(int gender, String translation) {
            this.gender = gender;
            this.translation = translation;
        }
    }

    public interface Predicate<T> {
        boolean match(T t);
    }

    //Set<Integer> seti = new HashSet<>();
    //
    // n log n (sort ) + n * log n = ~ n log n
    //
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>(Arrays.asList(Figure.values()));
        List<String> strings = new ArrayList<String>(Arrays.asList("aVSDv", "sdfsd", "asdfSDf"));

        filter(strings, new Predicate<String>() {
            @Override
            public boolean match(String s) {
                return s.startsWith("a");
            }
        });

        List<Integer> ints = new ArrayList<>();

        filter(ints, new Predicate<Integer>() {
            @Override
            public boolean match(Integer integer) {
                return integer % 2 == 0;
            }
        });

        System.out.println(strings);
    }

    public static <T> void filter(Collection<T> collection, Predicate<T> predicate) {
        for (Iterator<T> iterator = collection.iterator(); iterator.hasNext(); ) {
            T next = iterator.next();
            if (predicate.match(next)) {
                iterator.remove();
            }
        }
    }
}
