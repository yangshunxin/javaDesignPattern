package org.example.proxy.dynamicp;

import org.junit.Before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangshunxin
 * @create 2021-07-18-16:27
 */
public class JdkProxy implements InvocationHandler {
//    private Subject target =  new RealSubject();
    // 被代理的对象
    private Subject target;

    public Subject getInstance(Subject target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        // 动态代理的本质 就是适用反射机制实现
        Object result = method.invoke(this.target, args); // 调用实际的实例
        postRequst();
        return result;
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理，，，");
    }

    public void postRequst(){
        System.out.println("访问真实主题之后的处理，，，，");
    }

}
