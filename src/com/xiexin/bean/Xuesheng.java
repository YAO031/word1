package com.xiexin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * xuesheng
 * @author 
 */
public class Xuesheng implements Serializable {
    private Integer xid;

    private String xname;

    private Integer bid;

private List<Banji> banjis;

private List<Xbw> xbws;

    public List<Xbw> getXbws() {
        return xbws;
    }

    public void setXbws(List<Xbw> xbws) {
        this.xbws = xbws;
    }

    public List<Banji> getBanjis() {
        return banjis;
    }

    public void setBanjis(List<Banji> banjis) {
        this.banjis = banjis;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }



    private static final long serialVersionUID = 1L;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
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
        Xuesheng other = (Xuesheng) that;
        return (this.getXid() == null ? other.getXid() == null : this.getXid().equals(other.getXid()))
            && (this.getXname() == null ? other.getXname() == null : this.getXname().equals(other.getXname()))
            && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getXid() == null) ? 0 : getXid().hashCode());
        result = prime * result + ((getXname() == null) ? 0 : getXname().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Xuesheng{" +
                "xid=" + xid +
                ", xname='" + xname + '\'' +
                ", bid=" + bid +
                ", banjis=" + banjis +
                ", xbws=" + xbws +
                '}';
    }
}