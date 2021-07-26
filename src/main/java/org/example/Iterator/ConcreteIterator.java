package org.example.Iterator;

import java.util.List;

/**
 * @author yangshunxin
 * @create 2021-07-23-16:57
 */
public class ConcreteIterator implements Iterator{
    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    public boolean hasNext() {
        return index < list.size() - 1;
    }
    public Object first() {
        return list.get(0);
    }
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
