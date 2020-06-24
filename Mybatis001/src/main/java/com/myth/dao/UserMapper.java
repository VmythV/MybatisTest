package com.myth.dao;

import com.myth.pojo.User;

import java.util.List;

/**
 * @author MeiWeiDing
 * @Date 2020-06-04 10:16
 */
public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据id查用户
    User getUserById(int id);
    //
    List<User> getUserLike(String name);
    //增加用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
