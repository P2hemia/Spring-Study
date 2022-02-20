import cn.edu.nyist.config.ZConfig;
import cn.edu.nyist.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 16:08
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用了配置类方式去做，我们就只能通过 AnnotationConfig 上下文来获取容器，然后配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(ZConfig.class);
        User getUser = context.getBean("User", User.class);
        System.out.println(getUser.getName());
    }
}
