package org.example.command.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:16
 */
public class Test {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);

        System.out.println("客户访问调用者的call方法。。。");
        ir.call();
    }
}
