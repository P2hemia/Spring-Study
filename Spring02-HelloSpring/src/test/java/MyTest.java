import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.nyist.pojo.hello;
/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 21:55
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {
    public static void main(String[] args) {

        //获取Spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中的管理了，我们如果要使用，直接去里面取出来就可以了
        hello hello = (hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
