package com.xiexin.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AdminInfo {

    private String adminName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date adminTime;
    private String adminPwd;

    private List<Lover> loverList;

    private Integer [] aiHao;//1写代码 2看书 3 读报纸


    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminName='" + adminName + '\'' +
                ", adminTime=" + adminTime +
                ", adminPwd='" + adminPwd + '\'' +
                ", loverList=" + loverList +
                ", aiHao=" + Arrays.toString(aiHao) +
                '}';
    }

    public Integer[] getAiHao() {
        return aiHao;
    }

    public void setAiHao(Integer[] aiHao) {
        this.aiHao = aiHao;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Date getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(Date adminTime) {
        this.adminTime = adminTime;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public List<Lover> getLoverList() {
        return loverList;
    }

    public void setLoverList(List<Lover> loverList) {
        this.loverList = loverList;
    }

    //    private String city;
//
//    private List arr;
//    private String  open;
//    private String sex;

//    public String getOpen() {
//        return open;
//    }
//
//    public void setOpen(String open) {
//        this.open = open;
//    }
//
//    @Override
//    public String toString() {
//        return "AdminInfo{" +
//                "adminName='" + adminName + '\'' +
//                ", adminTime=" + adminTime +
//                ", adminPwd='" + adminPwd + '\'' +
//                ", city='" + city + '\'' +
//                ", arr=" + arr +
//                ", poen='" + open + '\'' +
//                ", esx='" + sex + '\'' +
//                '}';
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public List getArr() {
//        return arr;
//    }
//
//    public void setArr(List arr) {
//        this.arr = arr;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getAdminName() {
//        return adminName;
//    }
//
//    public void setAdminName(String adminName) {
//        this.adminName = adminName;
//    }
//
//    public Date getAdminTime() {
//        return adminTime;
//    }
//
//    public void setAdminTime(Date adminTime) {
//        this.adminTime = adminTime;
//    }
//
//    public String getAdminPwd() {
//        return adminPwd;
//    }
//
//    public void setAdminPwd(String adminPwd) {
//        this.adminPwd = adminPwd;
//    }
}
