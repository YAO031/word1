package com.xiexin.dao;

import com.xiexin.bean.Citys;
import com.xiexin.bean.CitysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CitysDAO {
    long countByExample(CitysExample example);

    int deleteByExample(CitysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Citys record);

    int insertSelective(Citys record);

    List<Citys> selectByExample(CitysExample example);

    Citys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByExample(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByPrimaryKeySelective(Citys record);

    int updateByPrimaryKey(Citys record);
}