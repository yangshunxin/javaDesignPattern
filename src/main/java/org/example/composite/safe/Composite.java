package org.example.composite.safe;

import java.util.ArrayList;

/**
 * @author yangshunxin
 * @create 2021-07-20-19:50
 */
// 树枝构件-- 有子构件
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();



    public void add(Component c) {
        children.add(c);
    }


    public void remove(Component c) {
        children.remove(c);
    }


    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj: children){
            ((Component)obj).operation();
        }
    }
}
