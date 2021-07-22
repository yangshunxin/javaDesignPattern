package org.example.decorator;

/**
 * @author yangshunxin
 * @create 2021-07-18-18:00
 */
public class Decorator implements Compoent{

    private Compoent compoent;

    public Decorator(Compoent compoent) {
        this.compoent = compoent;
    }

    @Override
    public void operation() {
        compoent.operation();
    }
}
