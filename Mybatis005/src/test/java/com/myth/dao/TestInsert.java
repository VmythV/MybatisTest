package com.myth.dao;

import com.myth.pojo.Blog;
import com.myth.utils.IDUtil;
import com.myth.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author myth
 * @Date 2020-06-17 12:41
 */
public class TestInsert {
    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setId(IDUtil.genId());
        blog.setTitle("JAVA从入门到放弃");
        blog.setAuthor("Bruce Eckel");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("MYSQL从入门到跑路");
        blog.setAuthor("MYSQL");
        blog.setCreateTime(new Date());
        blog.setViews(8888);
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("C语言从入门到入坟");
        blog.setAuthor("C");
        blog.setCreateTime(new Date());
        blog.setViews(7777);
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("Python从入门到崩溃");
        blog.setAuthor("Python");
        blog.setCreateTime(new Date());
        blog.setViews(6666);
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","MYSQL从入门到跑路");
        map.put("author","Bruce Eckel");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }


        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("id","fc8dbafbea6746b7a330731f1c17d541");
        map.put("author","JAVA");
        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","JAVA从入门到放弃");
        map.put("author","Python");
        map.put("views",7777);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }


        sqlSession.close();
    }
}
