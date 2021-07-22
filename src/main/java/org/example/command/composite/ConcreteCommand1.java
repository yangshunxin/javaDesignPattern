package org.example.command.composite;

/**
 * @author yangshunxin
 * @create 2021-07-22-14:22
 */
//树叶构件: 具体命令1
public class ConcreteCommand1 implements AbstractCommand{

    private CompositeReceiver receiver;

    public ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
