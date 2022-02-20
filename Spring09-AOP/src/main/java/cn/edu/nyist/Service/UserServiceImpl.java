package cn.edu.nyist.Service;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/16 15:18
 * @email p2hemia@nyist.edu.cn
 **/
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
        System.out.println("更新了一个用户");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户");
    }
}
