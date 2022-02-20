package cn.edu.nyist.demo02;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 19:59
 * @email p2hemia@nyist.edu.cn
 **/
//测试类
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);

        userServiceProxy.add();
    }
}
