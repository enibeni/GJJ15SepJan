package org.edu.gjj.dao;

import org.edu.gjj.model.Student;

import java.util.Set;

/**
 * @author Alex
 * @since 17.10.14
 */
public interface StudentDao {
    //CRUD

    /**
     * Fills student with id generated by database.
     */
    void addStudent(Student student);

    Student findById(long id) throws NotFoundException;

    Set<Student> findByLastName(String lastName);

    void deleteById(long id);

    /**
     * Updates all fields for student with id = student.getId();
     */
    void updateStudent(Student student);
}