package org.example.decorator;

/**
 * @author yangshunxin
 * @create 2021-07-18-18:01
 */
public class ConcreteDecodor extends Decorator{
    public ConcreteDecodor(Compoent compoent) {
        super(compoent);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("为具体构建角色增加额外的功能 addedFunction()");
    }
}
