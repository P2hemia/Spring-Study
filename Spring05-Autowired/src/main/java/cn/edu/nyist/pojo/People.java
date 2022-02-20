package cn.edu.nyist.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 12:27
 * @email p2hemia@nyist.edu.cn
 **/
public class People {

    @Resource(name = "cat1")
    private Cat cat;
    @Resource
    private Dog dog;

    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }
}
