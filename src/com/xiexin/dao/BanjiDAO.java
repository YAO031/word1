package com.xiexin.dao;

import com.xiexin.bean.Banji;
import com.xiexin.bean.BanjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanjiDAO {
    long countByExample(BanjiExample example);

    int deleteByExample(BanjiExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Banji record);

    int insertSelective(Banji record);

    List<Banji> selectByExample(BanjiExample example);

    Banji selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Banji record, @Param("example") BanjiExample example);

    int updateByExample(@Param("record") Banji record, @Param("example") BanjiExample example);

    int updateByPrimaryKeySelective(Banji record);

    int updateByPrimaryKey(Banji record);
}