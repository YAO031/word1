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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}

