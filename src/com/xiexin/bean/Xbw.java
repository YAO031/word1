package com.xiexin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * xbw
 * @author 
 */
public class Xbw implements Serializable {
    private Integer id;

    private Integer bid;

    private List<XbanweiExample> xbanweiExamples;

    public List<XbanweiExample> getXbanweiExamples() {
        return xbanweiExamples;
    }

    public void setXbanweiExamples(List<XbanweiExample> xbanweiExamples) {
        this.xbanweiExamples = xbanweiExamples;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        Xbw other = (Xbw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Xbw{" +
                "id=" + id +
                ", bid=" + bid +
                ", xbanweiExamples=" + xbanweiExamples +
                '}';
    }
}