package org.edu.getjavajob.lesson8;

/**
 * @author Alex
 * @since 26.09.14
 */
public class Functions {
//homework - implement transform for list
    public static interface Predicate<T> {
        boolean match(T target);
    }

    public static interface Function<T, F> {
        T apply(F input);
    }


}
