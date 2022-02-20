package cn.edu.nyist.demo03;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 23:17
 * @email p2hemia@nyist.edu.cn
 **/
//租客
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host); //将真实角色放置进去！
        Rent proxy = (Rent)pih.getProxy(); //动态生成对应的代理类！
        proxy.rent();
    }
}