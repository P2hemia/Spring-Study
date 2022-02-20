
import nyist.Utils.MybatisUtils;
import nyist.mapper.UserMapper;
import nyist.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/16 23:33
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    @Test
    public void test() throws IOException {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
        sqlSession.close();

    }
}
