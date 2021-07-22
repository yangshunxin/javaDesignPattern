package org.example.composite.transparency;

import java.io.PipedReader;

/**
 * @author yangshunxin
 * @create 2021-07-20-19:48
 */
// 树叶构件--无子构建
public class Leaf  implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+ name +"被访问了");
    }
}
