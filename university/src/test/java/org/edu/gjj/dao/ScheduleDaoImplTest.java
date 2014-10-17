package org.edu.gjj.dao;

import org.edu.gjj.DataSourceManager;
import org.edu.gjj.model.Student;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.edu.gjj.dao.Utils.date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * @author Alex
 * @since 17.10.14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml"})
public class ScheduleDaoImplTest {
    @Autowired
    private StudentDao dao;

    @BeforeClass
    public static void setUp() throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("Moscow"));
    }

    @Test
    public void testCrud() throws Exception {
        final Student expected = new Student(null, "Ivan", "Ivanov", date(1991, Calendar.JANUARY, 1), null);
        final Student expectedOther = new Student(null, "Ivan", "Petrov", date(1990, Calendar.JANUARY, 1), null);

        dao.addStudent(expected);
        dao.addStudent(expectedOther);

        System.out.println(expected);
        System.out.println(expectedOther);
        Long generatedId = expected.getId();
        assertNotNull(generatedId);

        Student actual = dao.findById(generatedId);

        //check all fields
        assertNotNull(actual);
        assertEquals(generatedId, actual.getId());
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());

        assertEquals(expected.getBirthDate(), actual.getBirthDate());
    }

    @Test(expected = NotFoundException.class)
    public void testNotFound() throws NotFoundException {
        dao.findById(123456L);
    }

}
