package org.edu.gjj.dao;

import org.edu.gjj.model.Student;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.Set;

/**
 * @author Alex
 * @since 17.10.14
 */
public class StudentDaoImpl extends NamedParameterJdbcDaoSupport implements StudentDao {
    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student findById(long id) {
        return null;
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
}
