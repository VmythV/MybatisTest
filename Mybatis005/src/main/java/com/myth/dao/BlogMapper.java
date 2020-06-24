package com.myth.dao;

import com.myth.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author myth
 * @Date 2020-06-17 12:36
 */
public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogChoose(Map map);
}
