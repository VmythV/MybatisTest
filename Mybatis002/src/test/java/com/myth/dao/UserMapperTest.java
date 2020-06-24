package com.myth.dao;

import com.myth.pojo.User;
import com.myth.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


/**
 * @author MeiWeiDing
 * @Date 2020-06-04 10:23
 */
public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test02() {
        logger.info("测试 1");
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        logger.debug("测试 2");
        sqlSession.close();
        logger.error("测试 finl");
    }


    @Test
    public void logtest() {
        logger.error("=======加载中=======");
        logger.warn("=======加载中=======");
        logger.info("=======加载中=======");
        logger.debug("=======加载中=======");
        String l = "qed";
    }

    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 2);
        map.put("pageSize", 2);
        List<User> userList = mapper.selectUser(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}