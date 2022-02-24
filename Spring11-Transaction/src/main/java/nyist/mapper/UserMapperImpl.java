package nyist.mapper;

import nyist.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/20 19:46
 * @email p2hemia@nyist.edu.cn
 **/
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    //在原来，我们所有的操纵，都是用sqlsession来执行，现在都使用SqlSessionTemplate
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    @Override
    public List<User> selectUser() {
        User user = new User(3, "王二", "111111");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(7);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
