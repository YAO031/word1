package com.xiexin.dao;

import com.xiexin.bean.Person;
import com.xiexin.bean.dto.personDto;

import java.util.List;
import java.util.Map;

public interface PersonDao {


    List<Person> selectAll();

    //单查
    List<Person > selectPersonBysex(int sex);
//    List<Person > selectPersonBysex(int sex,String name);不支持


    int selectcount();

    //实体类做参数

    int selecountByparam01(Person person);
//多表联查 的时候 用map为请求参数 返回用list
    List<Person> selecountByparam02(Map map);

    //查询最大值分数

    List<Person> selemax();

    //查询女生的分数平局值
    int selectang(Map map);

    //查询男生的成绩大于100的
    List<Person> selescore(Map map);

    List<personDto> selectavgq(int score) ;
    List<Map> selectavgmap(int score) ;

    //模糊查询第一种不建议
    List<Person> selectlike(String name);
    //模糊查询第二种不建议
    List<Person> selectlike02(String name);
    List<Person> selectlike03(String name);


    //add
    int inserperson(Person person);

    int delPersonByid(int id);//之后讲解 动态SQL
    //dao层接口中，只有基础的int，String 不好的 参数是一个map 或者实体类

//动态SQL

    List<Person> dongtaiselect(Person person);//动态参数如果不带参数就是实体类，或者集合就没有意义
    //返回值 是list的实体类 参数也是实体类，那么这是一个典型的SQL语句


    //动态修改
    int dengtaiupdate(Person person);


    //批量删除
    void  pilaingdel(Map map);

    //一对多

    List<Person> selectorderByperson(Integer id);

    List<Person> selectaaaaa(Integer id);
    //动态的查询
    List<Map> selectDetailByram(Map map);


List<Map> selectRoleByPename(String name);



}
