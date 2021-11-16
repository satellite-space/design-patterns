package com.wxy.design.patterns.creational.factory.config_factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * description: 使用简单工厂和配置文件实现的咖啡工厂——spring的实现方式 <br>
 * date: 2021/11/16 21:40 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class CoffeeFactory {

    private static Map<String, Coffee> beans = new HashMap<String, Coffee>();

    static {
        Properties p = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/main/java/com/wxy/design/patterns/creational/factory/config_factory/bean.properties");
            p.load(inputStream);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = (String) p.get(key);
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                beans.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取咖啡实例
     * @param name 咖啡名称
     * @return 实例
     */
    public static Coffee createCoffee(String name) {
        return beans.get(name);
    }

}
