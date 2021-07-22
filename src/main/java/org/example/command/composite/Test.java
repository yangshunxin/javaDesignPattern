package org.example.command.composite;

/**
 * @author yangshunxin
 * @create 2021-07-22-14:42
 */
public class Test {
    public static void main(String[] args) {
        AbstractCommand cmd1 = new ConcreteCommand1();
        AbstractCommand cmd2 = new ConcreteCommand2();
        CompositeInvoker ir = new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}
