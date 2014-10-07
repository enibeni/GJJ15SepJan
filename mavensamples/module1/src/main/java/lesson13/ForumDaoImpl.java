package lesson13;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * @author Alex
 * @since 07.10.14
 */
public class ForumDaoImpl extends NamedParameterJdbcDaoSupport implements ForumDao {
    private static final String GET_ALL_SQL = "select * from forumuser";
    private static final String GET_BY_LONG_SQL = "select * from forumuser where login = :login";

    @Override
    public List<ForumUser> getAllUsers() {
        return getJdbcTemplate().query(GET_ALL_SQL, ALL_ROWS_MAPPER);
    }

    @Override
    public ForumUser getUserByLogin(String login) throws UserNotFoundException {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("login", login, Types.VARCHAR);
        List<ForumUser> result = getNamedParameterJdbcTemplate().query(GET_BY_LONG_SQL, source, ALL_ROWS_MAPPER);
        if (result.size() == 0) {
            throw new UserNotFoundException();
        }
        return result.get(0);
    }

//    public void insertUser() {
//        getNamedParameterJdbcTemplate().update("insert into forumuser values(:login )", new MapSqlParameterSource("login", "akiyko")...
//    }

    private static RowMapper<ForumUser> ALL_ROWS_MAPPER = new RowMapper<ForumUser>() {
        @Override
        public ForumUser mapRow(ResultSet rs, int i) throws SQLException {
            final ForumUser user = new ForumUser();
            user.setUsername(rs.getString("LOGIN"));

            return user;
        }
    };
}
