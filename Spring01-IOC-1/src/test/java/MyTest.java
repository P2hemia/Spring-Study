import cn.edu.nyist.dao.UserDaoImpl;
import cn.edu.nyist.dao.UserDaoMySQLImpl;
import cn.edu.nyist.dao.UserDaoOracleImpl;
import cn.edu.nyist.service.UserService;
import cn.edu.nyist.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 17:27
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层他们不需要接触！
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();

        //获取ApplicationContext，拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么，就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
