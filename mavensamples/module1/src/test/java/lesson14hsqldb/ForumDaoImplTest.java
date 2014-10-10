package lesson14hsqldb;

import lesson13.ForumDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Alex
 * @since 09.10.14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml"})
public class ForumDaoImplTest {
    @Autowired
    ForumDao forumDao;

    @Test
    public void testGetAll() throws Exception {
//        ClassLoader l1 = ForumDao.class.getClassLoader();
        assertEquals(3, forumDao.getAllUsers().size());
    }
}
