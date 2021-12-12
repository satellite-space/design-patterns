package com.wxy.spring.context.support;

import com.wxy.spring.bean.BeanDefinition;
import com.wxy.spring.bean.MutablePropertyValues;
import com.wxy.spring.bean.PropertyValue;
import com.wxy.spring.bean.factory.support.BeanDefinitionRegistry;
import com.wxy.spring.bean.factory.xml.XmlBeanDefinitionReader;
import com.wxy.spring.util.StringUtils;

import java.lang.reflect.Method;

/**
 * description: TODO
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 20:28
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        // 构建XmlBeanDefinitionReader对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        // 1.先从容器中进行获取
        Object obj = this.singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }
        // 2.根据配置文件进行生成bean
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        if (beanDefinition == null) {
            return null;
        }

        String clazzName = beanDefinition.getClazz();
        Class<?> clazz = Class.forName(clazzName);
        Object newObj = clazz.newInstance();
        // 3.进行bean对象的依赖注入
        MutablePropertyValues properties = beanDefinition.getProperties();
        for (PropertyValue property : properties) {
            String propertyName = property.getName();
            String ref = property.getRef();
            String value = property.getValue();
            if (ref != null && !"".equals(ref)) {
                Object bean = getBean(ref);
                String setMethod = StringUtils.getSetterMethodNameByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(setMethod)) {
                        method.invoke(newObj, bean);
                    }
                }
            }

            if (value != null && !"".equals(value)) {
                String methodName = StringUtils.getSetterMethodNameByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(newObj, value);
            }
        }
        singletonObjects.put(name, newObj);
        return newObj;
    }

    @Override
    public <T> T getBean(String name, Class<T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null) {
            return null;
        }
        return clazz.cast(bean);
    }
}
