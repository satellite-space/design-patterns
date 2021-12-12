package com.wxy.spring.bean.factory.support;

/**
 * description: 用于解析注册表中的bean的信息接口
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 17:55
 */
public interface BeanDefinitionReader {
    /**
     * 获取注册表对象
     * @return 注册表对象
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 加载配置文件中的bean信息
     * @param configLocation 配置文件地址
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
