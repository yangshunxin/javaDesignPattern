package org.example.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yangshunxin
 * @create 2021-07-15-14:03
 *
 * 懒汉式单例模式
 *
 *
 */
public class LazyMan {
    // 构造器私有
    private LazyMan(){
        System.out.println(Thread.currentThread().getName() + " OK");
    }

    // 对象用的时候再去加载
    private volatile static LazyMan lazyMan; // volatile 防止创建对象时 指令重排
//    private static LazyMan lazyMan;

    // 单线程下，确实单例ok
    // 多线程下就有问题 --- 构造函数会被调用多次
    //  synchronized 就线程安全 了
    public static synchronized LazyMan getInstance(){
        if (lazyMan == null){
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }

    // 双重检测锁模式，懒汉式单例， DCL懒汉式
    // 这是当前最好的；
    public static LazyMan getInstanceDCL(){
        if (lazyMan==null){
            synchronized (LazyMan.class){
                if (lazyMan==null){
                    lazyMan = new LazyMan();// 不是一个原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     * 123
                     * 132 A
                     *
                     * */
                }

            }
        }
        return lazyMan;

    }


    public static void main(String[] args) throws Exception{

        // 多线程测试
        /**
        for (int i = 0; i < 100; i++) {
            // 开启10个线程来测试
            new Thread(()->{
//                LazyMan.getInstance();
                LazyMan.getInstanceDCL();

            }).start();
        }
         */
        // 反射测试
        // 普通方法创建对象
        LazyMan instance = LazyMan.getInstanceDCL();
        // 通过反射会破坏 上面的结构
        // 获取无参构造函数
        Constructor<LazyMan> lazyManConstructor = LazyMan.class.getDeclaredConstructor(null);
        lazyManConstructor.setAccessible(true);
        LazyMan instance1 = lazyManConstructor.newInstance();
        LazyMan instance2 = lazyManConstructor.newInstance();

        System.out.println(instance); // 创建的对象都不一样
        System.out.println(instance1);
        System.out.println(instance2);



    }


}
