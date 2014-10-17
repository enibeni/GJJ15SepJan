package org.edu.gjj.dao;

import org.edu.gjj.DataSourceManager;
import org.edu.gjj.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

import static org.edu.gjj.dao.Utils.date;
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


    @Test
    public void testCrud() throws Exception {

        final Student expected = new Student(null, "Ivan", "Ivanov", date(1991, Calendar.JANUARY, 1), null);

        dao.addStudent(expected);

        Long generatedId = expected.getId();
        assertNotNull(generatedId);
        //TODO: finish
    }

}
