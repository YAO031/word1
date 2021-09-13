package com.xiexin.dao;

import com.xiexin.bean.Xbw;
import com.xiexin.bean.XbwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XbwDAO {
    long countByExample(XbwExample example);

    int deleteByExample(XbwExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xbw record);

    int insertSelective(Xbw record);

    List<Xbw> selectByExample(XbwExample example);

    Xbw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xbw record, @Param("example") XbwExample example);

    int updateByExample(@Param("record") Xbw record, @Param("example") XbwExample example);

    int updateByPrimaryKeySelective(Xbw record);

    int updateByPrimaryKey(Xbw record);
}