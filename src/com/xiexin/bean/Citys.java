package com.xiexin.bean;

import java.io.Serializable;

/**
 * citys
 * @author 
 */
public class Citys implements Serializable {
    private Integer id;

    private Integer ids;

    private String dizhi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
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
        Citys other = (Citys) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIds() == null ? other.getIds() == null : this.getIds().equals(other.getIds()))
            && (this.getDizhi() == null ? other.getDizhi() == null : this.getDizhi().equals(other.getDizhi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIds() == null) ? 0 : getIds().hashCode());
        result = prime * result + ((getDizhi() == null) ? 0 : getDizhi().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ids=").append(ids);
        sb.append(", dizhi=").append(dizhi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}