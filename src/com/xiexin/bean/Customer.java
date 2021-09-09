package com.xiexin.bean;

import java.io.Serializable;

/**
 * customer
 * @author 
 */
public class Customer implements Serializable {
    private Integer cno;

    private Integer empno;

    private String cname;

    private String sex;

    private String education;

    private Integer sal;

    private String tel;

    private Integer money;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        Customer other = (Customer) that;
        return (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()))
            && (this.getEmpno() == null ? other.getEmpno() == null : this.getEmpno().equals(other.getEmpno()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getSal() == null ? other.getSal() == null : this.getSal().equals(other.getSal()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getEmpno() == null) ? 0 : getEmpno().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getSal() == null) ? 0 : getSal().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", empno=").append(empno);
        sb.append(", cname=").append(cname);
        sb.append(", sex=").append(sex);
        sb.append(", education=").append(education);
        sb.append(", sal=").append(sal);
        sb.append(", tel=").append(tel);
        sb.append(", money=").append(money);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}