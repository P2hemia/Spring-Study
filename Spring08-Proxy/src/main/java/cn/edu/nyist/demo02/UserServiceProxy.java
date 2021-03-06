package cn.edu.nyist.demo02;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 20:00
 * @email p2hemia@nyist.edu.cn
 **/
//代理实现类
public class UserServiceProxy implements UserService{
    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("使用了"+msg+"方法");
    }
}
