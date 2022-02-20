package nyist.mapper;

import nyist.pojo.User;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/17 14:36
 * @email p2hemia@nyist.edu.cn
 **/
public interface UserMapper {
    public List<User> selectUser();
}
