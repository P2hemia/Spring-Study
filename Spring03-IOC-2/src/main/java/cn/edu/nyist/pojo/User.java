package cn.edu.nyist.pojo;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 23:04
 * @email p2hemia@nyist.edu.cn
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name：" + name);
    }
}
