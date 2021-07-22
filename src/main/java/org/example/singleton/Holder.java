package org.example.singleton;

/**
 * @author yangshunxin
 * @create 2021-07-15-14:32
 *
 * 静态内部类实现
 *
 *  不安全的
 */
public class Holder {

    // 构造器私有
    private Holder(){}

    public Holder getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }


}
