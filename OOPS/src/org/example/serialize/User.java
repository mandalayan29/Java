package org.example.serialize;

import java.io.Serializable;

public class User implements Serializable {
//    Serialization means converting a Java object into a byte stream

    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id= id;
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
