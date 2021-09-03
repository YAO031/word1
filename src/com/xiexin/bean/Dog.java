package com.xiexin.bean;

public class Dog {

    private int id;
    private String dogSex;


    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", dogSex='" + dogSex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDogSex() {
        return dogSex;
    }

    public void setDogSex(String dogSex) {
        this.dogSex = dogSex;
    }
}
