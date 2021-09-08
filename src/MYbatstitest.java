import com.xiexin.bean.Person;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Before;
import org.junit.Test;

import javax.jms.Session;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.*;

public class MYbatstitest {

    private SqlSession sqlSession;//讲一下 mybaits的运行流程

    @Before//进行tets注解之前执行发发就是提取重复的
    public void befre() throws IOException {

        //接在并读取xml
        String path = "SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        sqlSession = sqlSessionFactory.openSession();

        System.out.println("sqlSession = " + sqlSession);


    }
    //

    @Test
    public void tets01() {

        List<Person> personList = sqlSession.selectList("com.xiexin.dao.PersonDao.selectAll");
        for (Person ss : personList) {
            System.out.println("ss = " + ss);


        }
        sqlSession.close();

    }


    @Test
    public void tets02() {
        List<Person> person = sqlSession.selectList("com.xiexin.dao.PersonDao.selectPersonBysex", 2);

        for (Person ss : person) {

            System.out.println("ss = " + ss);
        }

        sqlSession.close();


    }

    @Test
    public void test03() {

        int o = sqlSession.selectOne("com.xiexin.dao.PersonDao.selectcount");

        System.out.println("o = " + o);
        sqlSession.close();

    }

    //代参数一个类查询
    @Test
    public void test04() {

        Person person = new Person();
        person.setGender(2);
        person.setScore(100);
        int o = sqlSession.selectOne("com.xiexin.dao.PersonDao.selecountByparam01", person);

        System.out.println("o = " + o);

        sqlSession.close();
    }

    //map传参
    @Test
    public void test05() throws ParseException {
        String date = "2020-10-14";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sf.parse(date);
        Map map = new HashMap();
        map.put("gender", 2);
        map.put("birthday", birthday);

        List<Person> list = sqlSession.selectList("com.xiexin.dao.PersonDao.selecountByparam02", map);

        for (Person dd : list) {

            System.out.println("dd = " + dd);
        }

        sqlSession.close();

    }

    @Test
    public void test06() {
        List<Person> list = sqlSession.selectList("com.xiexin.dao.PersonDao.selemax");

        for (Person dd : list) {

            System.out.println("dd = " + dd);
        }

        sqlSession.close();


    }

    @Test
    public void test07() {

        Map map = new HashMap();
        map.put("gender", 2);

        int s = sqlSession.selectOne("com.xiexin.dao.PersonDao.selectang", map);
        System.out.println("s = " + s);
        sqlSession.close();
    }

    @Test
    public void test08() {

        Map map = new HashMap();
        map.put("score", 100);
        map.put("gender", 1);
        List<Person> ss = sqlSession.selectList("com.xiexin.dao.PersonDao.selescore", map);

        for (Person s : ss) {

            System.out.println("s = " + s);


        }
        sqlSession.close();
    }

    @Test
    public void test09() {

        List<Map> map = sqlSession.selectList("com.xiexin.dao.PersonDao.selectavgmap", 200);

        for (Map map1 : map) {

            System.out.println("map1 = " + map1);
        }
        sqlSession.close();
    }

    @Test
    public void test10(){

        //There is no getter for property named 'name' i $ 是注入

        Map map=new HashMap();
        map.put("name","孙");

        List<Person> person = sqlSession.selectList("com.xiexin.dao.PersonDao.selectlike", map);


        for (Person person1 : person) {

            System.out.println("person1 = " + person1);
        }

        sqlSession.close();
    }

    @Test
    public void test11(){
        List<Person> person =  sqlSession.selectList("com.xiexin.dao.PersonDao.selectlike02","孙");

        for (Person person1 : person) {
            System.out.println("person1 = " + person1);
        }
        sqlSession.close();
    }
    @Test
    public void test12(){
        List<Person> person =  sqlSession.selectList("com.xiexin.dao.PersonDao.selectlike03","孙");

        for (Person person1 : person) {
            System.out.println("person1 = " + person1);
        }
        sqlSession.close();
    }

    //以上是单标查询

    @Test
    public void test13(){

        Person person=new Person();
        person.setName("对象");
        person.setGender(1);
        person.setBirthday(new Date());
        person.setAddress("背景");
        person.setScore(666);

       int i= sqlSession.insert("com.xiexin.dao.PersonDao.inserperson",person);

        System.out.println("i = " + i);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test14(){

        int i = sqlSession.delete("com.xiexin.dao.PersonDao.delPersonByid",13);

        System.out.println("i = " + i);
        sqlSession.commit();
        sqlSession.close();

    }

    //动态SQL 重点 难点 也是高薪的起点
    //动态的SQL 就是一条语句实现多个效果
    //那么 要实现多种查询 就得硬性的条件
    //你的参数 必须多  一是放弃单个属性 二是用map
    /**
     * 第一类： 特征： 返回值是正常的结果集 对应的是person
     * 1.1,select * from person
     * 1.2. select * from person  where gender=2
     * 1.3. select * from person  where gender=#{gender}and birthday>=#{birthday}
     * 1.3. select * from person  where name like " % #{name} %"
     *
     *
     *
     *
     * 第二类： 特点返回值 一个数 单行单例 非person类
     * 2.1 select conut(*) from person
     * 2.2select* from person where gender=2 and score>100
     *
     * 综上所述 以上的SQL可以进行动态的判断 形成一个SQL 就是动态的SQL
     *
     *
     *
     *
     */

    @Test
    public void test15(){
        Person person=new Person();
        //null 就是全查
       // person.setId(4);

        person.setGender(2);
        person.setScore(200);
        List<Person> list = sqlSession.selectList("com.xiexin.dao.PersonDao.dongtaiselect", person);

        for (Person person1 : list) {
            System.out.println("person1 = " + person1);
        }

        sqlSession.close();
    }
    @Test
    public void test16(){

        Person person=new Person();

        person.setAddress("美国");
        person.setBirthday(new Date());
        person.setId(14);
        int i = sqlSession.update("com.xiexin.dao.PersonDao.dengtaiupdate", person);

        System.out.println("i = " + i);

        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void test17(){
        List<Integer> idList=new ArrayList<>();
        idList.add(1);
        idList.add(2);

        Map map=new HashMap();
        map.put("ids",idList);

        int i = sqlSession.delete("com.xiexin.dao.PersonDao.pilaingdel", map);
        System.out.println("i = " + i);
        sqlSession.commit();
        sqlSession.close();
    }
}

