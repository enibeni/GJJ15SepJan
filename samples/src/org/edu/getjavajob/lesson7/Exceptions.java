package org.edu.getjavajob.lesson7;

import java.math.BigDecimal;

/**
 * @author Alex
 * @since 23.09.14
 */
public class Exceptions {
    public static void main(String[] args) {
        uncheked(new Exception("checked"));
    }

    public static RuntimeException uncheked(Throwable e) {
        Exceptions.<RuntimeException>throwAny(e);
        return null;
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void throwAny(Throwable e) throws E {
        throw (E)e;
    }
}
