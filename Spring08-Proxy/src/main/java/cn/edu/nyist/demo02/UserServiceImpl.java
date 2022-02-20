package cn.edu.nyist.demo02;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 19:56
 * @email p2hemia@nyist.edu.cn
 **/
//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }

}
