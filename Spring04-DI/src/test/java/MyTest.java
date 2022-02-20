import cn.edu.nyist.pojo.Student;
import cn.edu.nyist.pojo.User;
import jdk.jfr.ContentType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/14 21:17
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        /*
        Student {
            name='张三',
            address=Address{address='上海'},
            books=[红楼梦, 西游记, 三国演义, 水浒传],
            hobbys=[敲代码, 看电影, 听歌],
            card={
               身份证=123456,
               银行卡=654321},
            games=[LOL, CSGO, CF],
            info={
               姓名=张三三,
               学号=2015105000,
               性别=男
            },
            wife='null'
        }
         */
    }
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }
}
