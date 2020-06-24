package com.myth.dao;

import com.myth.pojo.Teacher;

/**
 * @author myth
 * @Date 2020-06-16 12:48
 */
public interface TeacherMapper {
    //查询所以老师信息
    Teacher getTeacherById(int id);
}
