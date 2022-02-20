package cn.edu.nyist.pojo;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/13 21:43
 * @email p2hemia@nyist.edu.cn
 **/
public class hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
