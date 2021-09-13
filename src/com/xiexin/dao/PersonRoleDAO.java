package com.xiexin.dao;

import com.xiexin.bean.PersonRoleExample;
import com.xiexin.bean.PersonRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonRoleDAO {
    long countByExample(PersonRoleExample example);

    int deleteByExample(PersonRoleExample example);

    int deleteByPrimaryKey(PersonRoleKey key);

    int insert(PersonRoleKey record);

    int insertSelective(PersonRoleKey record);

    List<PersonRoleKey> selectByExample(PersonRoleExample example);

    int updateByExampleSelective(@Param("record") PersonRoleKey record, @Param("example") PersonRoleExample example);

    int updateByExample(@Param("record") PersonRoleKey record, @Param("example") PersonRoleExample example);
}