import nyist.mapper.UserMapper;
import nyist.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/23 20:29
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper",UserMapper.class);
        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }

    }


}
