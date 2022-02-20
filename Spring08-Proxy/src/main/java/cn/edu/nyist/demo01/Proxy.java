package cn.edu.nyist.demo01;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 17:24
 * @email p2hemia@nyist.edu.cn
 **/
//中介
public class Proxy extends Host {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    //签合同
    public void hetong() {
        System.out.println("签租赁合同");
    }
}
