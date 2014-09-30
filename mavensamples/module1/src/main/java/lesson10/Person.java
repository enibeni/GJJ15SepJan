package org.edu.gjj.lesson10;

import java.io.Serializable;

/**
 * @author Alex
 * @since 30.09.14
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 4097723952330625595L;

    private final String name;

    public Person(String name) {
        this.name = name;
    }
}
