package org.example.decorator;

import javafx.scene.layout.CornerRadii;

/**
 * @author yangshunxin
 * @create 2021-07-18-18:03
 */
public class Test {
    public static void main(String[] args) {
        Compoent p = new ConcreteComponent();
        p.operation();
        System.out.println("==================");
        Compoent d = new ConcreteDecodor(p);
        d.operation();
    }
}
