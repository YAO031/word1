package com.util;

import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDAO {

    //增删改

    //select * from t_user;

    public List<User> seleAll(){

        List<User> users=new ArrayList<>();
        //对数据库对接


        //很多架构 jdbc
        //连接数据库
        //步骤5
        //一创建对象
        Connection connection=DBHelper.getConnection();


        String sql="select * from t_user";//步骤二SQL语句

        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            //步骤三 获取预编译对象
             ps=connection.prepareStatement(sql);

             //步骤四 执行预编译对象
             rs= ps.executeQuery();

            //遍历结果集

            while (rs.next()){

                System.out.println("username = " + rs.getString("username"));//

                User user=new User();

                user.setId(rs.getInt("id"));
                user.setCreate_time(rs.getString("create_time"));
                user.setUsername(rs.getString("username"));
                user.setReal_name(rs.getString("real_name"));
                user.setImg(rs.getString("img"));
                user.setType(rs.getInt("type"));
                user.setIs_del(rs.getInt("is_del"));
                user.setModify_time(rs.getString("modify_time"));
                users.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }







        return users;


    }


    //新增

    public int add(User user){

        //创建连接对象
        Connection connection= DBHelper.getConnection();

        //因为添加的是变量用》？代替
        String sql="insert into t_user values (null,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=null;
        int i=0;
        try {
           ps= connection.prepareStatement(sql);//预编译对象

            //进行预编译
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());

            ps.setString(3,user.getReal_name());
            ps.setString(4,user.getImg());
            ps.setInt(5,user.getType());
            ps.setInt(6,user.getIs_del());
            ps.setString(7,user.getCreate_time());
            ps.setString(8,user.getModify_time());


            //执行，预编译对象
          i= ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;

    }

    //修改
    public int uodate(User user){

        Connection connection=null;
        PreparedStatement ps=null;;
        int i=0;


        String sql="update t_user set id=?,username=?,password=?,real_name=?,img=?,type=?,is_del=?,create_time=?,modify_time=? where id=?";
        connection=DBHelper.getConnection();
        try {
            ps=connection.prepareStatement(sql);
            ps.setInt(1,user.getId());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());

            ps.setString(4,user.getReal_name());
            ps.setString(5,user.getImg());
            ps.setInt(6,user.getType());
            ps.setInt(7,user.getIs_del());
            ps.setString(8,user.getCreate_time());
            ps.setString(9,user.getModify_time());
            ps.setInt(10,user.getId());

            i=ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

            return i;
    }


        //删除
    public int del(int i){
        Connection connection=null;
        PreparedStatement ps=null;
        User user=new User();

        int a=0;
        String sql="delete from t_user where id=?";

        connection=DBHelper.getConnection();
        try {
            ps=connection.prepareStatement(sql);

            ps.setInt(1,i);

            a=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;

    }



    public static void main(String[] args) {
      UserDAO userDAO=new UserDAO();
//
//        List<User> user=userDAO.seleAll();
//        for (User users:user){
//
//            System.out.println("user = " + users);
//        }




//        User user=new User();
//        user.setUsername("小乔");
//        user.setType(1);
//        user.setReal_name("qiao");
//        user.setPassword("1234");
//        user.setModify_time("2021-09-12");
//        user.setIs_del(2);
//        user.setCreate_time("2021-09-12");
//        user.setImg("XXX");
//
//        int i=userDAO.add(user);
//        System.out.println("i = " + i);
        //修改
//        User user=new User();
//        user.setId(7);
//        user.setUsername("大乔");
//        user.setType(1);
//        user.setReal_name("qiao");
//        user.setPassword("1234");
//        user.setModify_time("2021-09-12");
//        user.setIs_del(2);
//        user.setCreate_time("2021-09-12");
//        user.setImg("XXX");
//
//        int i=userDAO.uodate(user);
//        System.out.println("i = " + i);

         User user=new User();

       int a= userDAO.del(7);
        System.out.println(a);






    }

}
