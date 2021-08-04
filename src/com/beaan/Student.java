package com.beaan;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private int age;
    private Date birthday;
    private boolean isShen;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", isShen=" + isShen +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isShen() {
        return isShen;
    }

    public void setShen(boolean shen) {
        isShen = shen;
    }



    public Date getBirthbay() {
        return birthday;
    }

    public void setBirthbay(Date birthbay) {
        this.birthday = birthbay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


}
