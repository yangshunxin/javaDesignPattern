package org.example.composite.transparency;

/**
 * @author yangshunxin
 * @create 2021-07-20-19:46
 */
// 抽象组件
public interface Component {

    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();


}
