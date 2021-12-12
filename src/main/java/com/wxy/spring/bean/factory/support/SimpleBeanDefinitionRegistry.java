package com.wxy.spring.bean.factory.support;

import com.wxy.spring.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * description: bean注册表接口的简单实现类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 17:28
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> map;

    public SimpleBeanDefinitionRegistry() {
        this.map = new HashMap<>();
    }

    @Override
    public void addBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        map.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) {
        map.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return map.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return map.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return map.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return map.keySet().toArray(new String[0]);
    }
}
