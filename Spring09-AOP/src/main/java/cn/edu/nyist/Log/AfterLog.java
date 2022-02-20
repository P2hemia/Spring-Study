package cn.edu.nyist.Log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/16 15:23
 * @email p2hemia@nyist.edu.cn
 **/
public class AfterLog implements AfterReturningAdvice {
    //returnValue：返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
    }
}
