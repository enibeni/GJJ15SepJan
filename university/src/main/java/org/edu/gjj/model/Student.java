package org.edu.gjj.model;

import java.util.Date;

/**
 * @author Alex
 * @since 17.10.14
 */
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    private Group group;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, Date birthDate, Group group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
