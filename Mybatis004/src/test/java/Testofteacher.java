import com.myth.dao.TeacherMapper;
import com.myth.pojo.Teacher;
import com.myth.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author myth
 * @Date 2020-06-16 22:30
 */
public class Testofteacher {
    @Test
    public void testteacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }

    @Test
    public void testteacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);

        System.out.println(teacher2);
    }
}
