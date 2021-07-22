package org.example.builder.director;

/**
 * @author yangshunxin
 * @create 2021-07-16-18:43
 */
public class test {
    public static void main(String[] args) {
        // 指挥
        Director director = new Director();

        // 指挥 具体的工人完成 产品
        //
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
