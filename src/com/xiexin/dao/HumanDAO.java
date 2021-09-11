package com.xiexin.dao;

import com.xiexin.bean.Human;
import com.xiexin.bean.HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanDAO {
    long countByExample(HumanExample example);//用example类查总条数，动态的SQL去查询总条数
    //当  example 类 为null的时候
    //select* from human
    //当  example 类 不为null的时候
    //select* from human where gender=2 参数如何传递呢
    int deleteByExample(HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Human record);//当Hume对象 所有属性都在可以用他

    int insertSelective(Human record);//进量用他

    List<Human> selectByExample(HumanExample example);

    Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKey(Human record);
}