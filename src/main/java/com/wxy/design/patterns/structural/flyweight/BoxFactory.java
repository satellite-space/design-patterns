package com.wxy.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 享元工厂
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 21:52
 */
public class BoxFactory {

    /**
     * 享元对象集合
     */
    private final Map<String, AbstractBox> map = new HashMap<String, AbstractBox>();

    /**
     * 私有构造器
     */
    private BoxFactory() {
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    /**
     * 单实例对象
     */
    private static final BoxFactory FACTORY = new BoxFactory();

    /**
     * 单例获取方法
     * @return 单例对象
     */
    public static BoxFactory getInstance() {
        return FACTORY;
    }

    /**
     * 获取具体享元类
     * @param shape 形状
     * @return 享元类
     */
    public AbstractBox getBox(String shape) {
        return map.get(shape);
    }

}
