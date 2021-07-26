package org.example.Iterator;

/**
 * @author yangshunxin
 * @create 2021-07-23-16:55
 */
//抽象迭代器
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
