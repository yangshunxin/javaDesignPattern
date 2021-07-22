package org.example.command.composite;

import java.util.ArrayList;

/**
 * @author yangshunxin
 * @create 2021-07-22-14:27
 */
public class CompositeInvoker implements AbstractCommand{

    // 这里实现了方法的组合，类似于套餐的情况
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();

    public void add(AbstractCommand c){
        children.add(c);
    }

    public void remove(AbstractCommand c){
        children.remove(c);
    }

    public AbstractCommand getChild(int i){
        return children.get(i);
    }


    @Override
    public void execute() {
        for(AbstractCommand obj : children){
            obj.execute();
        }
    }
}
