package com.spark.entity;

import java.io.Serializable;

/**
 * Created with IDEA
 * User: vector
 * Data: 2018/4/20 0020
 * Time: 11:14
 * Description:
 */
public class People implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
