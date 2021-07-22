package org.example.command.cook;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:48
 */
public class ChangFen implements Breakfast{

    private ChangFenChef receive;

    public ChangFen() {
        receive = new ChangFenChef();
    }

    @Override
    public void cooking() {
        receive.cooking();
    }
}
