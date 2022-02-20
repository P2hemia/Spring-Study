package cn.edu.nyist.demo04;

import cn.edu.nyist.demo02.UserService;
import cn.edu.nyist.demo02.UserServiceImpl;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/16 14:38
 * @email p2hemia@nyist.edu.cn
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService); //设置要代理的角色

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
