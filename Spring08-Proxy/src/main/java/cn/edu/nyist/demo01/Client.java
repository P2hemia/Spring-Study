package cn.edu.nyist.demo01;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 17:23
 * @email p2hemia@nyist.edu.cn
 **/
//租客
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介帮房东租房子，但是代理一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
