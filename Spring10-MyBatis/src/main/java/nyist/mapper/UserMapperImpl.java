package nyist.mapper;

import nyist.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/20 19:46
 * @email p2hemia@nyist.edu.cn
 **/
public class UserMapperImpl implements UserMapper{

    //在原来，我们所有的操纵，都是用sqlsession来执行，现在都使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
