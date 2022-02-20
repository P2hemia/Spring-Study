package cn.edu.nyist.config;

import cn.edu.nyist.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 15:55
 * @email p2hemia@nyist.edu.cn
 **/
// 这个也会被Spring容器托管，注册到容器中，因为它本来也是一个@Component
// Configuration代表这是个配置类，就和我们之前用过的beans.xml一样
@Configuration
@ComponentScan("cn.edu.nyist")
@Import(ZConfig2.class)
public class ZConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值， 就相当于bean标签中的class属性
    @Bean
    public User User() {
        return new User();  // 就是返回要注入到bean的对象
    }
}
