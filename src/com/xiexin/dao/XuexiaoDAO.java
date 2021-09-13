package com.xiexin.dao;

import com.xiexin.bean.Xuexiao;
import com.xiexin.bean.XuexiaoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface XuexiaoDAO {
    long countByExample(XuexiaoExample example);

    int deleteByExample(XuexiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xuexiao record);

    int insertSelective(Xuexiao record);

    List<Xuexiao> selectByExample(XuexiaoExample example);

    Xuexiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xuexiao record, @Param("example") XuexiaoExample example);

    int updateByExample(@Param("record") Xuexiao record, @Param("example") XuexiaoExample example);

    int updateByPrimaryKeySelective(Xuexiao record);

    int updateByPrimaryKey(Xuexiao record);

    List<Xuexiao> select(Integer id);

    List<Map> selectBtyid(Map map);
}