package com.myth.dao;

import com.myth.pojo.User;
import com.myth.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author MeiWeiDing
 * @Date 2020-06-04 10:23
 */
public class UserMapperTest {
    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
    @Test
    public void test02(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);


        sqlSession.close();
    }

    @Test
    public void test03(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int add = mapper.addUser(new User(4, "赵六", "123456"));

        if (add>0){
            System.out.println("插入成功!");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test04(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int a = mapper.updateUser(new User(4, "赵小姐", "111111"));

        if (a>0){
            System.out.println("修改成功!");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test05(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        if (i>0){
            System.out.println("删除成功!");
        }

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test06(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserLike("王");

        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
