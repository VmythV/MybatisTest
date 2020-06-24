package com.myth.dao;

import com.myth.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author myth
 * @Date 2020-06-16 12:48
 */
public interface TeacherMapper {
    /**
     * 获取老师及对应学生的列表
     */
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(int id);
}
