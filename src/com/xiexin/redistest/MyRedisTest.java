package com.xiexin.redistest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.JedisPool;

import javax.swing.plaf.basic.BasicComboBoxUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*

redis 的测试

第一步：在APplicationContext中中的xml注释放开
第二部：把DB.properties

Springmvc 的 单元测试
传统的main发放测试不了，为什么用juint单元测试
单元测试的好处：在最小的 代码结构单元中 找出bug ，最快速的找出bug
迅速解决 一个dao方法一个测试 一个controller 一个测试 一个service 一个测试


 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})//模拟ssm运行加载运行的xmlwenjian
public class MyRedisTest {

    @Autowired
    private JedisPool jedisPool;


    //测试String类型
    @Test
    public void test01(){
        String pcode = jedisPool.getResource().set("pcode", "4758");
        System.out.println("pcode = " + pcode);
        Set<String> keys = jedisPool.getResource().keys("*");
        System.out.println("keys = " + keys);


    }


    //测试哈希

    @Test
    public void  test03(){



    }



    //作业

    @Test
    public void  by01(){
        List<String > list=new ArrayList<>();

            list.add("白世纪");
            list.add("陈红利");
            list.add("陈世纪");
            list.add("陈洋洋");
            list.add("杜晓梦");
            list.add("付春辉");
            list.add("高芳芳");
            list.add("郭旭");
            list.add("胡艺果");
            list.add("贾礼博");
            list.add("李雪莹");
            list.add("李祎豪");
            list.add("林梦娇");
            list.add("刘顺顺");
            list.add("卢光辉");
            list.add("吕亚伟");
            list.add("宁静静");
            list.add("牛志洋");
            list.add("史倩影");
            list.add("宋健行");
            list.add("孙超阳");
            list.add("孙乾力");
            list.add("田君垚");
            list.add("汪高洋");
            list.add("王学斌");
            list.add("杨天枫");
            list.add("杨原辉");
            list.add("袁仕奇");
            list.add("张浩宇");
            list.add("张晓宇");
            list.add("张志鹏");
            list.add("赵博苛");
            list.add("邹开源");
        System.out.println("list = " + list);

//        for (String s : list) {
//            System.out.println("s = " + s);
//
//            Long banji = jedisPool.getResource().sadd("banji", s);
//
//
//
//
//        }
        Set<String> banji1 = jedisPool.getResource().smembers("banji");
        System.out.println("banji1 = " + banji1);

        String banji = jedisPool.getResource().spop("banji");
        System.out.println("banji = " + banji);

        Long banji2 = jedisPool.getResource().scard("banji");
        System.out.println("banji2 = " + banji2);

    }

    @Test
    public void by02(){

        List<String > list=new ArrayList<>();
        List<String > list1=new ArrayList<>();

        list.add("白世纪");
        list.add("陈红利");
        list.add("陈世纪");
        list.add("陈洋洋");
        list.add("杜晓梦");

        list1.add("付春辉");
        list1.add("高芳芳");
        list1.add("郭旭");
        list1.add("胡艺果");
        list1.add("贾礼博");

//        for (String s : list) {
//
//          jedisPool.getResource().lpush("shuju", s);
//
//
//        }
//        for (String s : list1) {
//
//
//            jedisPool.getResource().rpush("shuju",s);
//
//        }

        String shuju1 = jedisPool.getResource().lindex("shuju", 4);
        System.out.println("shuju1 = " + shuju1);


        jedisPool.getResource().lpop("shuju");
        jedisPool.getResource().rpop("shuju");

        Long shuju2 = jedisPool.getResource().llen("shuju");
        System.out.println("shuju2 = " + shuju2);

//        Long linsert = (Long) jedisPool.getResource().linsert("shuju",,"");
        List<String> shuju = jedisPool.getResource().lrange("shuju", 0, -1);
        System.out.println("shuju = " + shuju);



    }





}
