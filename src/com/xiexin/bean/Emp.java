package com.xiexin.bean;

import java.io.Serializable;

/**
 * emp
 * @author 
 */
public class Emp implements Serializable {
    private Integer empno;

    private String ename;

    private String sex;

    private Integer age;

    private String tel;

    private Integer deptno;

    private static final long serialVersionUID = 1L;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
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
        Emp other = (Emp) that;
        return (this.getEmpno() == null ? other.getEmpno() == null : this.getEmpno().equals(other.getEmpno()))
            && (this.getEname() == null ? other.getEname() == null : this.getEname().equals(other.getEname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getDeptno() == null ? other.getDeptno() == null : this.getDeptno().equals(other.getDeptno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpno() == null) ? 0 : getEmpno().hashCode());
        result = prime * result + ((getEname() == null) ? 0 : getEname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDeptno() == null) ? 0 : getDeptno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empno=").append(empno);
        sb.append(", ename=").append(ename);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", tel=").append(tel);
        sb.append(", deptno=").append(deptno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}