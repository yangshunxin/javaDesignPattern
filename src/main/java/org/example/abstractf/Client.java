package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:31
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("========小米系列产品================");

        IProductFactory iProductFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = iProductFactory.iphoneProduct();
        iphoneProduct.start();
        iphoneProduct.shutdown();

        IRouterProduct iRouterProduct = iProductFactory.routerProduct();
        iRouterProduct.openWifi();
        iRouterProduct.shudown();

        System.out.println("========华为系列产品================");

        IProductFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphone = huaweiFactory.iphoneProduct();
        iphone.start();
        iphone.shutdown();

        IRouterProduct router = huaweiFactory.routerProduct();
        router.openWifi();
        router.shudown();

    }
}
