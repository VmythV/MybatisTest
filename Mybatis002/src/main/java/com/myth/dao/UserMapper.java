package com.myth.dao;

import com.myth.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author MeiWeiDing
 * @Date 2020-06-04 10:16
 */
public interface UserMapper {

    //根据id查用户
    User getUserById(int id);

    List<User> selectUser(Map<String,Integer> map);
}
