package com.wxy.spring.bean.factory;

/**
 * description: 获取Bean对象
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 18:45
 */
public interface BeanFactory {

    /**
     * 获取bean对象
     * @param name 对象名
     * @return bean对象
     */
    Object getBean(String name) throws Exception;

    /**
     * 获取范型bean对象
     * @param name 对象名
     * @param clazz 对象类型
     * @param <T> 范型
     * @return bean对象
     */
    <T> T getBean(String name, Class<T> clazz) throws Exception;
}
