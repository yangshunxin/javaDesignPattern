package org.example.adapter;

/**
 * @author yangshunxin
 * @create 2021-07-17-17:13
 */
// 客户端类： 想上网，插不上网线
public class Computer2 {

    // 电脑想上网
    public void net(NetToUsb adapter){
        // 上网的具体实现，， 找一个转接头
        adapter.handleRequest();

    }


    public static void main(String[] args) {
        // 电脑， 适配器， 网线
        Computer2 computer = new Computer2(); // 电脑
        Adaptee adaptee = new Adaptee(); // 网线
        // 把网线插在转接器上，这里就可以用不同的转接器和不同的网线，只要实现了对应的接口
        Adapter2 adapter = new Adapter2(adaptee); // 转接器

        computer.net(adapter);
    }

}
