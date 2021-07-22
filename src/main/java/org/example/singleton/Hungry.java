package org.example.singleton;

/**
 * @author yangshunxin
 * @create 2021-07-15-13:56
 *
 * 单例模式： 构造器私有，外面无法实例化对象，保证内存中只有一个对象
 * 饿汉式单例模式：
 *      由于是static的变量，故加载类的时候，就是实例化对象了；
 *      缺点：浪费内存
 *
 */
public class Hungry {
    // 这里浪费空间
    private Byte[] data1 = new Byte[1024*1024];
    private Byte[] data2 = new Byte[1024*1024];
    private Byte[] data3 = new Byte[1024*1024];
    private Byte[] data4 = new Byte[1024*1024];


    // 私有化的构造函数
    private Hungry(){}
    // 实例出对象
    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }

}
