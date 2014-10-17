package org.edu.gjj.university.dao;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alex
 * @since 16.10.14
 */
public class Utils {
    public static Date date(int year, int month, int day) {
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(0);
        calendar.set(year, month, day);

        return calendar.getTime();
    }
}
