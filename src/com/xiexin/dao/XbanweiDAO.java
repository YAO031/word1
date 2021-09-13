package com.xiexin.dao;

import com.xiexin.bean.Xbanwei;
import com.xiexin.bean.XbanweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XbanweiDAO {
    long countByExample(XbanweiExample example);

    int deleteByExample(XbanweiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xbanwei record);

    int insertSelective(Xbanwei record);

    List<Xbanwei> selectByExample(XbanweiExample example);

    Xbanwei selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xbanwei record, @Param("example") XbanweiExample example);

    int updateByExample(@Param("record") Xbanwei record, @Param("example") XbanweiExample example);

    int updateByPrimaryKeySelective(Xbanwei record);

    int updateByPrimaryKey(Xbanwei record);
}