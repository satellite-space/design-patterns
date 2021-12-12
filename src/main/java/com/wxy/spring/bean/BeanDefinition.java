package com.wxy.spring.bean;

/**
 * description: 用于封装bean的信息。
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 17:07
 */
public class BeanDefinition {

    /**
     * id标识
     */
    private String id;

    /**
     * 全类名路径
     */
    private String clazz;

    /**
     * 子标签集合
     */
    private MutablePropertyValues properties;

    public BeanDefinition() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public MutablePropertyValues getProperties() {
        return properties;
    }

    public void setProperties(MutablePropertyValues properties) {
        this.properties = properties;
    }
}
