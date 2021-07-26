package org.example.Iterator;

/**
 * @author yangshunxin
 * @create 2021-07-23-16:55
 */
//抽象聚合
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();

}
