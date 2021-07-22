package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:26
 *
 * 抽象产品工厂
 */
public interface IProductFactory {

    // 生产手机
    IphoneProduct iphoneProduct();

    // 生产路由器
    IRouterProduct routerProduct();
}
