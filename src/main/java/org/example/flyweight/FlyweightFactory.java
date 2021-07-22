package org.example.flyweight;

import com.sun.org.apache.bcel.internal.generic.IFNULL;

import java.util.HashMap;

/**
 * @author yangshunxin
 * @create 2021-07-18-20:50
 */
public class FlyweightFactory {

    private final HashMap<String, Flyweight> flyweightHashMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweightHashMap.get(key);
        if (flyweight != null){
            System.out.println("具体享元" + key + "已经存在， 被成功获取");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key, flyweight);
        }
        return flyweight;
    }


}
