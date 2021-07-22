package org.example.command.cook;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:49
 */
//具体命令：馄饨
public class HunTun implements Breakfast{
    HunTunChef receive;

    public HunTun() {
        receive = new HunTunChef();
    }

    @Override
    public void cooking() {
        receive.Cooking();
    }
}
