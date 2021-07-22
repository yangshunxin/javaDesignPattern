package org.example.template;

/**
 * @author yangshunxin
 * @create 2021-07-20-20:36
 */
// 抽象类
public abstract class AbstractClass {
    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        // 通过在 这里根据 方法的返回值，构建不同的流程
        // 称为 钩子方法
        abstractMethod2();
    }
    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();

}
