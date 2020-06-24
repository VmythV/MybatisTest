import com.myth.dao.StudentMapper;
import com.myth.dao.TeacherMapper;
import com.myth.pojo.Student;
import com.myth.pojo.Teacher;
import com.myth.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author myth
 * @Date 2020-06-16 12:52
 */
public class TestMapper {
    @Test
    public void testgetTeacherList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);

        sqlSession.close();
    }
    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentlist = mapper.getStudent();
        for (Student student : studentlist) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
