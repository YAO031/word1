import com.xiexin.bean.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MYbatstitest {

    private  SqlSession sqlSession;

    @Before//进行tets注解之前执行发发就是提取重复的
    public void befre() throws IOException {

        //接在并读取xml
        String path="SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);

         sqlSession=sqlSessionFactory.openSession();

        System.out.println("sqlSession = " + sqlSession);


    }

    @Test
    public void tets01()  {

        List<Person> personList = sqlSession.selectList("com.xiexin.dao.PersonDao.selectAll");
        for(Person ss:personList){
            System.out.println("ss = " + ss);


        }
            sqlSession.close();

    }
}
