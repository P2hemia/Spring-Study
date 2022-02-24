
import nyist.mapper.UserMapper;
import nyist.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/16 23:33
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }
    @Test
    public void kuaipai() {
        int[] str = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int length=str.length;
        int min;
        int i;
        int j;
        for (i=0;i<length;i++) {
            min=i;
            for(j=i+1;j<length;j++) {
                if(str[j]<str[min]) {
                    min=j;
                }
            }
            if (min!=i) {
                int temp;
                temp=str[min];
                str[min]=str[i];
                str[i]=temp;
            }
        }
        for(i=0;i<length;i++) {
            System.out.println(str[i]);
        }
    }
}
