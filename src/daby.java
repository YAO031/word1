//import com.xiexin.bean.Customer;
//import com.xiexin.bean.CustomerExample;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class daby {
//
//    private SqlSession sqlSession;
//
//
//    @Before//进行tets注解之前执行发发就是提取重复的
//    public void befre() throws IOException {
//
//        //接在并读取xml
//        String path = "SqlMapConfig.xml";
//        InputStream is = Resources.getResourceAsStream(path);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//
//        sqlSession = sqlSessionFactory.openSession();
//
//        System.out.println("sqlSession = " + sqlSession);
//
//
//    }
//
//
//    @Test
//    public void daby01(){
//
//        Map mapp=new HashMap();
//        mapp.put("cid","01");
//        mapp.put("ccid","02");
//
//     List<Map> map=  sqlSession.selectList("com.xiexin.dao.DabyDao.daby01",mapp);
//        for (Map map1 : map) {
//
//            System.out.println("map1 = " + map1);
//
//        }
//            sqlSession.close();
//    }
//
//    @Test
//    public void daby02(){
//
//        Map mapp=new HashMap();
//        mapp.put("cid","01");
//        mapp.put("ccid","02");
//
//        List<Map> map=  sqlSession.selectList("com.xiexin.dao.DabyDao.daby02",mapp);
//        for (Map map1 : map) {
//
//            System.out.println("map1 = " + map1);
//
//        }
//        sqlSession.close();
//    }
//
//
//    @Test
//    public void daby03(){
//
//        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby03");
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//        }
//
//        sqlSession.close();
//    }
//
//    @Test
//    public void daby04(){
//
//        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby04");
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//        }
//
//        sqlSession.close();
//    }
//    @Test
//    public void daby05(){
//
//        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby05");
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//        }
//
//        sqlSession.close();
//    }
//    @Test
//    public void daby06(){
//        Map mapp=new HashMap();
//        mapp.put("name","李");
//
//        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby06",mapp);
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//        }
//
//        sqlSession.close();
//    }
//
//    @Test
//    public void daby07(){
//
//
//        Map mapp=new HashMap();
//        mapp.put("cid","02");
//        List<Map> map = sqlSession.selectList("com.xiexin.dao.DabyDao.daby07", mapp);
//
//        for (Map map1 : map) {
//
//            System.out.println("map1 = " + map1);
//        }
//
//        sqlSession.close();
//    }
//
//    @Test
//    public void daby08(){
//
//        Map mapp=new HashMap();
//
//        mapp.put("cid","01");
//        mapp.put("cid1","03");
//        mapp.put("cid2","02");
//
//       List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby08",mapp);
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//
//        }
//        sqlSession.close();
//    }
//
//    @Test
//    public void daby09(){
//
//        Map mapp=new HashMap();
//
//        mapp.put("cid","01");
//        mapp.put("ccid","02");
//
//
//        List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby09",mapp);
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//
//        }
//        sqlSession.close();
//    }
//
//    @Test
//    public void daby10(){
//        Map mapp=new HashMap();
//
//        mapp.put("cid","01");
//        mapp.put("ccid","02");
//
//
//        List<Map> map= sqlSession.selectList("com.xiexin.dao.DabyDao.daby10",mapp);
//
//        for (Map map1 : map) {
//            System.out.println("map1 = " + map1);
//
//        }
//        sqlSession.close();
//
//
//
//    }
//
//    /**
//     *
//     * 2021年9月9日11:39:35
//     *
//     */
//
//    @Test
//    public void test01(){
//
//        CustomerExample example=new CustomerExample();
//        CustomerExample.Criteria criteria= example.createCriteria();
//
//
//        criteria.andSalBetween(5000,7000);
//
//
//        List<Customer> list = sqlSession.selectList("com.xiexin.dao.CustomerDAO.selectByExample",example);
//        for (Customer customer : list) {
//            System.out.println("customer = " + customer);
//
//        }
//        sqlSession.close();
//
//
//    }
//    @Test
//    public void test02(){
//
//        CustomerExample example=new CustomerExample();
//        CustomerExample.Criteria criteria= example.createCriteria();
//
//
//       criteria.andEducationEqualTo("专科");
//       criteria.andSalGreaterThanOrEqualTo(3700);
//
//
//       example.setOrderByClause("sal  desc  ");
//
//
//        List<Customer> list = sqlSession.selectList("com.xiexin.dao.CustomerDAO.selectByExample",example);
//        for (Customer customer : list) {
//            System.out.println("customer = " + customer);
//
//        }
//        sqlSession.close();
//
//
//    }
//
//
//    @Test
//    public void test03(){
//
//        CustomerExample example=new CustomerExample();
//        CustomerExample.Criteria criteria= example.createCriteria();
//
//
//
//      criteria.andCnameLike("%"+"明"+"%");
//
//
//
//
//        List<Customer> list = sqlSession.selectList("com.xiexin.dao.CustomerDAO.selectByExample",example);
//        for (Customer customer : list) {
//            System.out.println("customer = " + customer);
//
//        }
//        sqlSession.close();
//
//
//    }
//    @Test
//    public void test04(){
//
//        CustomerExample example=new CustomerExample();
//        CustomerExample.Criteria criteria= example.createCriteria();
//
//
//
//        criteria.andCnameLike("%"+"刚"+"%");
//
//
//
//
//        List<Customer> list = sqlSession.selectList("com.xiexin.dao.CustomerDAO.selectByExample",example);
//        for (Customer customer : list) {
//            System.out.println("customer = " + customer);
//
//        }
//        sqlSession.close();
//
//
//    }
//
//    @Test
//    public void test05(){
//
//        CustomerExample example=new CustomerExample();
//        CustomerExample.Criteria criteria= example.createCriteria();
//
//
//
//       criteria.andSalGreaterThanOrEqualTo(5000);
//
//
//
//
//        List<Customer> list = sqlSession.selectList("com.xiexin.dao.CustomerDAO.selectByExample",example);
//        for (Customer customer : list) {
//            System.out.println("customer = " + customer);
//
//        }
//        sqlSession.close();
//
//
//    }
//
//    @Test
//    public void test06(){
//
//        List<Map> list = sqlSession.selectList("com.xiexin.dao.Comprehensive.comprehensive06");
//
//        for (Map map : list) {
//            System.out.println("map = " + map);
//        }
//        sqlSession.close();
//    }
//    @Test
//    public void test07(){
//        Map map1=new HashMap();
//        map1.put("id",1);
//        List<Map> list = sqlSession.selectList("com.xiexin.dao.Comprehensive.comprehensive07",map1);
//
//        for (Map map : list) {
//            System.out.println("map = " + map);
//        }
//        sqlSession.close();
//    }
//    @Test
//    public void test08(){
//
//        List<Map> list = sqlSession.selectList("com.xiexin.dao.Comprehensive.comprehensive08");
//
//        for (Map map : list) {
//            System.out.println("map = " + map);
//        }
//        sqlSession.close();
//    }
//    @Test
//    public void test09(){
//
//        List<Map> list = sqlSession.selectList("com.xiexin.dao.Comprehensive.comprehensive09");
//
//        for (Map map : list) {
//            System.out.println("map = " + map);
//        }
//        sqlSession.close();
//    }
//
//    @Test
//    public void test10(){
//
//        List<Map> list = sqlSession.selectList("com.xiexin.dao.Comprehensive.comprehensive10");
//
//        for (Map map : list) {
//            System.out.println("map = " + map);
//        }
//        sqlSession.close();
//    }
//       @Test
//    public void test11(){
//        Map map=new HashMap();
//        map.put("name","李东海");
//        int i= sqlSession.update("com.xiexin.dao.Comprehensive.updata",map);
//
//        System.out.println("i = " + i);
//        sqlSession.close();
//    }
//
//    @Test
//    public void test12(){
//
//        int i= sqlSession.update("com.xiexin.dao.Comprehensive.updata01");
//
//        System.out.println("i = " + i);
//        sqlSession.close();
//    }
//
//    @Test
//    public void test13(){
//Map map=new HashMap();
//map.put("name","刘国华");
//        int i= sqlSession.delete("com.xiexin.dao.Comprehensive.dele",map);
//
//        System.out.println("i = " + i);
//        sqlSession.close();
//    }
//
//
//
//
//}
