package lesson13;

import java.util.List;

/**
 * @author Alex
 * @since 07.10.14
 */
public interface ForumDao {
    //query
    List<ForumUser> getAllUsers();
    ForumUser getUserByLogin(String login) throws UserNotFoundException;

    //modification section
//    void insertUser();
}
