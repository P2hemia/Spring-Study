package cn.edu.nyist.dao;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 17:30
 * @email p2hemia@nyist.edu.cn
 **/
public class UserDaoMySQLImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户数据");
    }
}
