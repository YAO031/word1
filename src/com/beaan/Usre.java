package com.beaan;

public class Usre {
    private String name;
    private int age;
    private String zhiye;

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

    public String getZhiye() {
        return zhiye;
    }

    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }

    @Override
    public String toString() {
        return "Usre{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zhiye='" + zhiye + '\'' +
                '}';
    }
}
