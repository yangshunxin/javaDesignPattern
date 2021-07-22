package org.example.command.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:15
 */
//调用者
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void call(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
