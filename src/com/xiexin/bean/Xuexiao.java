package com.xiexin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * xuexiao
 * @author 
 */
public class Xuexiao implements Serializable {
    private Integer id;

    private String name;



protected  List<Xuesheng> xueshengs;

    public List<Xuesheng> getXueshengs() {
        return xueshengs;
    }

    public void setXueshengs(List<Xuesheng> xueshengs) {
        this.xueshengs = xueshengs;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Xuexiao other = (Xuexiao) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Xuexiao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xueshengs=" + xueshengs +
                '}';
    }
}