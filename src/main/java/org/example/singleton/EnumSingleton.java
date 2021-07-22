package org.example.singleton;

import java.lang.reflect.Constructor;



// Resource是我们要应用单例模式的资源
class Resource{

    private int id;
    private String userName;

    public Resource() {
        System.out.println(Thread.currentThread().getName() + " OK");
    }

    public Resource(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

/**
 * @author yangshunxin
 * @create 2021-07-15-15:06
 */
public enum EnumSingleton {
    INSTANCE;
    private final Resource instance;
    EnumSingleton(){
        instance = new Resource(11, "ysx"); // 只会实例化一次
    }

    public Resource getInstance(){
        return instance;
    }
}

class Test{

    public static void main(String[] args) throws Exception {
//        EnumSingleton instance1 = EnumSingleton.INSTANCE;

//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        declaredConstructor.setAccessible(true);
//
//        // 创建对象
//        EnumSingleton instance2 = declaredConstructor.newInstance();

        //
//        System.out.println(instance1);
//        System.out.println(instance2);

        // 多线程测试
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Resource r = EnumSingleton.INSTANCE.getInstance();
                System.out.println(r.getId() +" " + r.getUserName());
            }).start();
        }



    }
}

