package lesson13;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

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

    private static final String INSERT_THEME_SQL = "insert into THEME (NAME) values (:themeName)";
    //SELECT LAST_INSERT_ID()

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

    @Override
    public Theme addTheme(Theme theme) {
        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("themeName", theme.getName(), Types.VARCHAR);
        KeyHolder keyHolder = new GeneratedKeyHolder();

        getNamedParameterJdbcTemplate().update(INSERT_THEME_SQL, source, keyHolder);

        return new Theme(keyHolder.getKey().longValue(), theme.getName());
    }

//    public void insertUser() {
//        getNamedParameterJdbcTemplate().update("insert into forumuser values(:login )", new MapSqlParameterSource("login", "akiyko")...
//    }

    private static RowMapper<ForumUser> ALL_ROWS_MAPPER = new RowMapper<ForumUser>() {
        @Override
        public ForumUser mapRow(ResultSet rs, int i) throws SQLException {
            final ForumUser user = new ForumUser();
            user.setUsername(rs.getString("LOGIN"));
            user.setEmail(rs.getString("EMAIL"));
            //TODO: map all columns
            return user;
        }
    };
}
