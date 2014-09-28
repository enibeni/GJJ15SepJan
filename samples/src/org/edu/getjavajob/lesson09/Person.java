package org.edu.getjavajob.lesson09;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

import java.io.Serializable;

/**
 * @author Alex
 * @since 28.09.14
 */
public class Person implements Serializable{

    private String name;
    private transient int age;
//    Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
