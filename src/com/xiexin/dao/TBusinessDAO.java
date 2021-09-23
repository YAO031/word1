package com.xiexin.dao;

import com.xiexin.bean.TBusiness;
import com.xiexin.bean.TBusinessExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TBusinessDAO {
    long countByExample(TBusinessExample example);

    int deleteByExample(TBusinessExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(TBusiness record);

    int insertSelective(TBusiness record);

    List<TBusiness> selectByExample(TBusinessExample example);

    TBusiness selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") TBusiness record, @Param("example") TBusinessExample example);

    int updateByExample(@Param("record") TBusiness record, @Param("example") TBusinessExample example);

    int updateByPrimaryKeySelective(TBusiness record);

    int updateByPrimaryKey(TBusiness record);

    //两表擦汗寻 是因为将二个表显示到 一张表中，就要用的map 不是用的1对多

    List<Map> seelctTwoTable();

}