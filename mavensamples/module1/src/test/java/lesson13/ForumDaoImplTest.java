package lesson13;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Alex
 * @since 07.10.14
 */
public class ForumDaoImplTest {
    private static ForumDao forumDao;

    @BeforeClass
    public static void setUp() throws Exception {
        DataSource dataSource = DataSourceProvider.getInstance().getDataSource();
        forumDao = new ForumDaoImpl();
        ((ForumDaoImpl)forumDao).setDataSource(dataSource);//to be done by dependency injection manager such as spring.
    }

    @Test
    public void testGetAll() throws Exception {
        assertEquals(3, forumDao.getAllUsers().size());
        System.out.println(forumDao.getAllUsers());
    }

    @Test(expected = UserNotFoundException.class)
    public void testGetByIdUserNotFound() throws Exception {
        forumDao.getUserByLogin("invalid");
    }

    @Test()
    public void testGetByIdUserFound() throws Exception {
        assertEquals("akiyko", forumDao.getUserByLogin("akiyko").getUsername());
        System.out.println(forumDao.getUserByLogin("akiyko"));
    }

    @Test()
    public void testInsertTheme() throws Exception {
        Theme actual = forumDao.addTheme(new Theme(null, "Motorola"));
        assertEquals("Motorola", actual.getName());
        assertNotNull(actual.getId());
    }
}
