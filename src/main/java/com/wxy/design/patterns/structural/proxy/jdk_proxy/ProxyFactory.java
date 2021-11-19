package com.wxy.design.patterns.structural.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description: JDK动态代理工厂
 * 代理类也实现了抽象主题类
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 22:19
 */
public class ProxyFactory {

    // 目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        /**
         * newProxyInstance()方法参数说明：
         *     ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
         *     Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         *     InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxy = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *InvocationHandler中invoke方法参数说明：
                     *      proxy ： 代理对象
                     *      method ： 对应于在代理对象上调用的接口方法的 Method 实例
                     *      args ： 代理对象调用接口方法时传递的实际参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 增强方法
                        System.out.println("增强原方法——代售点进行火车票销售");
                        // 调用执行目标对象中的方法，进行结果的返回
                        Object object = method.invoke(station, args);
                        return object;
                    }
                }
        );
        return proxy;
    }
}
