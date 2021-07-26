package org.example.visitor.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-10:28
 */
public interface Element {

    void accept(Visitor visitor);
}
