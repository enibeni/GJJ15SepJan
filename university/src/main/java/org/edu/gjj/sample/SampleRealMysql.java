package org.edu.gjj.sample;

import org.edu.gjj.dao.StudentDao;
import org.edu.gjj.dao.StudentDaoImpl;
import org.edu.gjj.model.Student;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alex
 * @since 17.10.14
 */
public class SampleRealMysql {
    public static void main(String[] args) {
        StudentDaoImpl dao = new StudentDaoImpl();
        dao.setDataSource(DataSourceProvider.getInstance().getDataSource());

        final Student expected = new Student(null, "Ivan", "Ivanov", date(1991, Calendar.JANUARY, 1), null);
        final Student expectedOther = new Student(null, "Ivan", "Petrov", date(1990, Calendar.JANUARY, 1), null);

        dao.addStudent(expected);
        dao.addStudent(expectedOther);

        System.out.println(expected);
        System.out.println(expectedOther);
    }

    public static Date date(int year, int month, int day) {
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(0);
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}
