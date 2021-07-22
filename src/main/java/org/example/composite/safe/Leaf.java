package org.example.composite.safe;

/**
 * @author yangshunxin
 * @create 2021-07-20-19:48
 */
// 树叶构件--无子构建
public class Leaf  implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }


    public void add(Component c) {

    }


    public void remove(Component c) {

    }


    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+ name +"被访问了");
    }
}
