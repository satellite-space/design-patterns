package com.wxy.spring.context.support;

import com.wxy.spring.bean.BeanDefinition;
import com.wxy.spring.bean.factory.support.BeanDefinitionReader;
import com.wxy.spring.bean.factory.support.BeanDefinitionRegistry;
import com.wxy.spring.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * description: TODO
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 19:05
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    /**
     * bean解析器
     */
    protected BeanDefinitionReader beanDefinitionReader;

    /**
     * 存储bean的容器
     */
    protected Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 配置文件存储路径
     */
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        // 加载配置文件
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 初始化bean
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            // 此处使用了模板方法，具体的实现由子类去进行
            getBean(beanName);
        }
    }
}
