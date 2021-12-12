package com.wxy.spring.bean.factory.support;

import com.wxy.spring.bean.BeanDefinition;

/**
 * description: bean注册表接口
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 17:22
 */
public interface BeanDefinitionRegistry {

    /**
     * 添加bean到注册表中
     * @param beanName bean名称
     * @param beanDefinition bean实体
     */
    void addBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 从注册表中删除bean的信息
     * @param beanName bean名称
     */
    void removeBeanDefinition(String beanName);

    /**
     * 根据名称从注册表获取bean的实体类信息
     * @param beanName bean名称
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 判断注册表中是否包含bean的信息
     * @param beanName bean名称
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取注册表中bean的数量
     * @return bean的数量
     */
    int getBeanDefinitionCount();

    /**
     * 获取注册表中bean的全部名称
     * @return bean的名称
     */
    String[] getBeanDefinitionNames();
}
