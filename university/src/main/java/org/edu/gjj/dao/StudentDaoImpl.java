package org.edu.gjj.dao;

import org.edu.gjj.model.Student;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import org.springframework.jdbc.core.RowMapper;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Alex
 * @since 17.10.14
 */
public class StudentDaoImpl extends NamedParameterJdbcDaoSupport implements StudentDao {
    private final static String INSERT_STUDENT_SQL = "insert into STUDENT (FIRSTNAME, LASTNAME, BIRTH_DATE)" +
            " values (:FIRSTNAME, :LASTNAME, :BIRTH_DATE)";
    private final static String FIND_BY_ID_SQL = "select * from STUDENT where ID=:id";

    private DataSource dataSource;

    @Override
    public void addStudent(Student student) {
        final MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("FIRSTNAME", student.getFirstName());
        params.addValue("LASTNAME", student.getLastName());
        params.addValue("BIRTH_DATE", student.getBirthDate(), Types.DATE);

        final GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        getNamedParameterJdbcTemplate().update(INSERT_STUDENT_SQL, params, keyHolder);
        student.setId(keyHolder.getKey().longValue());
    }

    @Override
    public Student findById(long id) throws NotFoundException {
        MapSqlParameterSource param = new MapSqlParameterSource("id", id);
        List<Student> students = getNamedParameterJdbcTemplate().query(FIND_BY_ID_SQL, param, ALL_ROWS_MAPPER);

        if(students == null || students.isEmpty()) {
            throw new NotFoundException("Student not found for Id: " + id);
        }

        //optional check
        if(students.size() > 1) {
            throw new DataIntegrityViolationException("Found more that one students for Id" + id);
        }

        return students.get(0);
    }

    @Override
    public Set<Student> findByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    private static RowMapper<Student> ALL_ROWS_MAPPER = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int i) throws SQLException {
            final Student student = new Student();
            //ID, FIRSTNAME, LASTNAME, BIRTH_DATE
            student.setId(rs.getLong("ID"));
            student.setBirthDate(rs.getDate("BIRTH_DATE"));
            student.setFirstName(rs.getString("FIRSTNAME"));
            student.setLastName(rs.getString("LASTNAME"));

            return student;
        }
    };

}
