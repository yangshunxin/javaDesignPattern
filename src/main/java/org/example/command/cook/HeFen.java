package org.example.command.cook;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:51
 */
public class HeFen implements Breakfast{

    private HeFenChef receive;

    public HeFen() {
        receive = new HeFenChef();
    }

    @Override
    public void cooking() {
        receive.cooking();
    }
}
