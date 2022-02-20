package cn.edu.nyist.service;

import cn.edu.nyist.dao.UserDao;
import cn.edu.nyist.dao.UserDaoImpl;
import cn.edu.nyist.dao.UserDaoMySQLImpl;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 17:23
 * @email p2hemia@nyist.edu.cn
 **/
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoMySQLImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
