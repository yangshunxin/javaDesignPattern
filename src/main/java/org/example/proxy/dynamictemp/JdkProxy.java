package org.example.proxy.dynamictemp;

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
        System.out.println("调用前 为 " + method.getName() + " 方法增加了日志功能");
        // 动态代理的本质 就是适用反射机制实现
        Object result = method.invoke(this.target, args); // 调用实际的实例
        System.out.println("调用后 为 " + method.getName() + " 方法增加了日志功能");
        return result;
    }

}
