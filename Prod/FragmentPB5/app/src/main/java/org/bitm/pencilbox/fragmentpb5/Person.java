package org.bitm.pencilbox.fragmentpb5;

import java.io.Serializable;

/**
 * Created by Mobile App on 5/26/2018.
 */

public class Person implements Serializable{
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
