package cn.edu.nyist.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 15:53
 * @email p2hemia@nyist.edu.cn
 **/
//这里这个注解的意思为这个类被Spring接管了，被注册到了容器中
@Component
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("张三三")   //属性注入值
    public void setName(String name) {
        this.name = name;
    }
}
