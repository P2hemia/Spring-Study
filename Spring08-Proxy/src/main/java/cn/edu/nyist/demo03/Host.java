package cn.edu.nyist.demo03;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 17:22
 * @email p2hemia@nyist.edu.cn
 **/
//房东
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
