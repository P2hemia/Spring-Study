package cn.edu.nyist.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 15:01
 * @email p2hemia@nyist.edu.cn
 **/
// 等价于 <bean id="user" class="cn.edu.nyist.pojo.User"/>
// Component 组件
@Component
public class User {

    public String name;

    // 等价于 <property name="name" value="张三三"/>
    @Value("张三三")
    public void setName(String name) {
        this.name = name;
    }
}
