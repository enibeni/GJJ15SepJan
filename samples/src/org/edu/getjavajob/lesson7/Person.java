package org.edu.getjavajob.lesson7;

import java.util.*;

/**
 * @author Alex
 * @since 22.09.14
 */
public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("A", "a", 1);
        Person p2 = new Person("A", "b", 1);

        Map<Person, String> map = new HashMap<>();
        map.put(p1, "value1");
        map.put(p2, "value2");

        List<String> list = new LinkedList<>();

        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);


        System.out.println(map.get(p1));

    }

    private final String firstName;
    private final String lastName;
    private final int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthYear != person.birthYear) return false;
        if (!firstName.equals(person.firstName)) return false;
//        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;

        return true;
    }



//    @Override
//    public int hashCode() {
//        int result = firstName.hashCode();
////        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
//        result = 31 * result + birthYear;
//        return result;
//    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
