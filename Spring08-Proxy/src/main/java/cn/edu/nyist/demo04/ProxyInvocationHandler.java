package cn.edu.nyist.demo04;

import cn.edu.nyist.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/15 23:09
 * @email p2hemia@nyist.edu.cn
 **/
//我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //核心：本质利用反射实现！
        Object result = method.invoke(target, args);
        log(method.getName());
        return result;
    }

    //日志方法
    public void log(String msg) {
        System.out.println("使用了"+msg+"方法");
    }
}
