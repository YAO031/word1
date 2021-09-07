import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class daby {

    private SqlSession sqlSession;


    @Before//进行tets注解之前执行发发就是提取重复的
    public void befre() throws IOException {

        //接在并读取xml
        String path = "SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        sqlSession = sqlSessionFactory.openSession();

        System.out.println("sqlSession = " + sqlSession);


    }


    @Test
    public void daby01(){

        Map mapp=new HashMap();
        mapp.put("cid","01");
        mapp.put("ccid","02");

     List<Map> map=  sqlSession.selectList("com.xiexin.dao.DabyDao.daby01",mapp);
        for (Map map1 : map) {

            System.out.println("map1 = " + map1);

        }
            sqlSession.close();
    }

    @Test
    public void daby02(){

        Map mapp=new HashMap();
        mapp.put("cid","01");
        mapp.put("ccid","02");

        List<Map> map=  sqlSession.selectList("com.xiexin.dao.DabyDao.daby02",mapp);
        for (Map map1 : map) {

            System.out.println("map1 = " + map1);

        }
        sqlSession.close();
    }


    @Test
    public void daby03(){

        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby03");

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }

        sqlSession.close();
    }

    @Test
    public void daby04(){

        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby04");

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }

        sqlSession.close();
    }
    @Test
    public void daby05(){

        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby05");

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }

        sqlSession.close();
    }
    @Test
    public void daby06(){
        Map mapp=new HashMap();
        mapp.put("name","李");

        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby06",mapp);

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);
        }

        sqlSession.close();
    }

    @Test
    public void daby07(){


        Map mapp=new HashMap();
        mapp.put("cid","02");
        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby07", mapp);

        for (Map map1 : map) {

            System.out.println("map1 = " + map1);
        }

        sqlSession.close();
    }

    @Test
    public void daby08(){

        Map mapp=new HashMap();

        mapp.put("cid","01");
        mapp.put("cid1","03");
        mapp.put("cid2","02");

       List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby08",mapp);

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);

        }
        sqlSession.close();
    }

    @Test
    public void daby09(){

        Map mapp=new HashMap();

        mapp.put("cid","01");
        mapp.put("ccid","02");


        List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby09",mapp);

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);

        }
        sqlSession.close();
    }

    @Test
    public void daby10(){
        Map mapp=new HashMap();

        mapp.put("cid","01");
        mapp.put("ccid","02");


        List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby10",mapp);

        for (Map map1 : map) {
            System.out.println("map1 = " + map1);

        }
        sqlSession.close();



    }


}
