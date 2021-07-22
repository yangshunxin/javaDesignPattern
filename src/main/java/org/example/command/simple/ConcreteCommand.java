package org.example.command.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:12
 */
//具体命令
// 具体命令封装了 接收者对象
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
