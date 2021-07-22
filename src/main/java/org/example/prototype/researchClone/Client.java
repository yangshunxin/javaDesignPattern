package org.example.prototype.researchClone;

import java.util.Date;

/**
 * @author yangshunxin
 * @create 2021-07-17-16:20
 */
public class Client {
    // 实现克隆

    public static void main(String[] args) throws CloneNotSupportedException {
        // 运行对象

        Date date = new Date();

        Video v1 = new Video("杨擦擦", date);
        System.out.println("v1=>"+v1);
        System.out.println("v1=>hash:"+v1.hashCode());


        // v1 克隆 v2
        //Video v2 =  new Video("杨擦擦", date);
        Video v2 = (Video) v1.clone();

        System.out.println("v2=>"+v2);
        System.out.println("v2=>hash:"+v2.hashCode());

        /**
         * 结论：
         *  克隆出来的对象跟原来的对象一模一样，hashcode不一样，
         *  所以不是同一个对象；
         */

        System.out.println("========修改 v2的name");
        v2.setName("yangcaca");
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);
        // 只有v1对象的值还是原来的，v2对象的值成为了新的
        System.out.println("========修改 v2的 date 的值");
        v2.setCreateTime(new Date());
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);
        // v1和v2中日期不一样
        System.out.println("========修改 date 的值");
        date.setTime(2234578);
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);
        // v1和v2中日期一样，都变成了新的值，这是我们不喜欢看见的
        // 为了解决这个问题，我们重新写了 clone方法


    }

}
