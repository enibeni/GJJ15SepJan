package lesson14hsqldb;

import lesson13.ForumDao;
import lesson13.ForumUser;
import lesson13.UserNotFoundException;
import org.junit.BeforeClass;
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

    @BeforeClass
    public static void setUp() {
        //init etc..
    }

    @Test
    public void testGetAll(Integer i) throws Exception {
        ClassLoader l1 = ForumDao.class.getClassLoader();
        assertEquals(3, forumDao.getAllUsers().size());
    }

    @Test(expected = UserNotFoundException.class)
    public void testGetByLoginNotFound() throws Exception {
        forumDao.getUserByLogin("not_existent");
    }

    @Test
    public void testGetByLoginFound() throws Exception {
        ForumUser user = forumDao.getUserByLogin("akiyko");
        assertEquals("a@k.m.ru", user.getEmail());
        assertEquals("akiyko", user.getUsername());
    }
}
