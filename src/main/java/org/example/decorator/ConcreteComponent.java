package org.example.decorator;

/**
 * @author yangshunxin
 * @create 2021-07-18-17:58
 */
public class ConcreteComponent implements Compoent{

    public ConcreteComponent() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法 operation()");
    }
}
