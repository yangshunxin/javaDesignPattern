package org.example.visitor.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunxin
 * @create 2021-07-26-10:30
 */
public class ObjectStructure {

    private final List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }


    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }


}
