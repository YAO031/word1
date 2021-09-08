package com.xiexin.bean.dto;

import java.util.List;

public class personDto {

    private int gender;
    private double avgscore;

    @Override
    public String toString() {
        return "personDto{" +
                "gender=" + gender +
                ", avgscore=" + avgscore +
                '}';
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(double avgscore) {
        this.avgscore = avgscore;
    }




}
