package com.wxy.spring.context;

import com.wxy.spring.bean.factory.BeanFactory;

/**
 * description: Bean工厂的延时实现接口
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 18:48
 */
public interface ApplicationContext extends BeanFactory {
    /**
     * 加载配置文件，并生成bean对象
     * @throws Exception 异常
     */
    void refresh() throws Exception;
}
