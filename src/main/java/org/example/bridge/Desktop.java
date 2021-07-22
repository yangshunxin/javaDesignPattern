package org.example.bridge;

/**
 * @author yangshunxin
 * @create 2021-07-18-14:56
 */
public class Desktop extends Computer{
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}
