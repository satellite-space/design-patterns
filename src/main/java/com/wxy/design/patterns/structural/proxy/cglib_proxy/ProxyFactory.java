package com.wxy.design.patterns.structural.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib动态代理类——代理对象类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 14:55
 */
public class ProxyFactory implements MethodInterceptor {

    // 目标对象类
    private TrainStation target = new TrainStation();

    /**
     * 获取动态代理对象类的方法——CGLib通过将真实对象类当做代理类的父类，来实现多态
     * @return 代理对象
     */
    public TrainStation getProxyFactory() {
        // 创建Enhancer，相当于JDK动态代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类对象的字节码
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 生成代理对象
        TrainStation proxy = (TrainStation) enhancer.create();
        return proxy;
    }

    /**
     * 回调函数
     * @param o 代理对象类
     * @param method 真实对象中的方法的Method的实例
     * @param objects 实际参数
     * @param methodProxy 代理对象中的方法的Method的实例
     * @return 代理对象的真实执行结果
     * @throws Throwable throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取部分手续费");
        // 1.通过代理对象的方法进行执行
        TrainStation o1 = (TrainStation) methodProxy.invokeSuper(o, objects);
        // return o1;
        // 2. 通过真实对象中的方法进行执行
        Object invoke = method.invoke(method, objects);
        return invoke;
    }
}
