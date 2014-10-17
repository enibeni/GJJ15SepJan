package org.edu.gjj.dao;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alex
 * @since 17.10.14
 */
public class Utils {
    private Utils() {
    }

    public static Date date(int year, int month, int day) {
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(0);
        calendar.set(year, month, day);
        return calendar.getTime();
    }

}
