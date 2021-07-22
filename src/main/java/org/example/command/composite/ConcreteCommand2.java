package org.example.command.composite;

/**
 * @author yangshunxin
 * @create 2021-07-22-14:26
 */
public class ConcreteCommand2 implements AbstractCommand{

    private CompositeReceiver receiver;

    public ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
