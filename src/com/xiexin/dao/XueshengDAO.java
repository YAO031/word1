package com.xiexin.dao;

import com.xiexin.bean.Xuesheng;
import com.xiexin.bean.XueshengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueshengDAO {
    long countByExample(XueshengExample example);

    int deleteByExample(XueshengExample example);

    int deleteByPrimaryKey(Integer xid);

    int insert(Xuesheng record);

    int insertSelective(Xuesheng record);

    List<Xuesheng> selectByExample(XueshengExample example);

    Xuesheng selectByPrimaryKey(Integer xid);

    int updateByExampleSelective(@Param("record") Xuesheng record, @Param("example") XueshengExample example);

    int updateByExample(@Param("record") Xuesheng record, @Param("example") XueshengExample example);

    int updateByPrimaryKeySelective(Xuesheng record);

    int updateByPrimaryKey(Xuesheng record);


    List<Xuesheng> select(String name);
}