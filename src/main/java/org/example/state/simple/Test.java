package org.example.state.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-16:20
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();  //创建环境类
        context.handle(); // 处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
