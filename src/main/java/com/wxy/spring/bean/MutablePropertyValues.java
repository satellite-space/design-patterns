package com.wxy.spring.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * description: 用于封装bean标签中的多个property子标签
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 16:33
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    /**
     * bean标签中的properties标签
     */
    private final List<PropertyValue> properties;

    public MutablePropertyValues() {
        this.properties = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> properties) {
        this.properties = properties == null ? new ArrayList<>() : properties;
    }

    /**
     * 返回property标签的数组
     * @return property标签数组
     */
    public PropertyValue[] getPropertyValues() {
        return properties.toArray(new PropertyValue[0]);
    }

    /**
     * 根据property的名称返回具体的属性
     * @param propertyName 属性名
     * @return 属性对象
     */
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue property : this.properties) {
            if (propertyName.equals(property.getName())) {
                return property;
            }
        }
        return null;
    }

    /**
     * 返回迭代器
     * @return 迭代器
     */
    @Override
    public Iterator<PropertyValue> iterator() {
        return properties.iterator();
    }

    /**
     * 判断当前集合是否为空
     * @return 是否为空
     */
    public boolean isEmpty() {
        return properties.isEmpty();
    }

    /**
     * 添加property标签，若存在则替换，若不存在则添加
     * @param propertyValue 新增属性
     * @return 当前对象，用于链式编程
     */
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        for (int i = 0; i < this.properties.size(); i++) {
            PropertyValue pv = this.properties.get(i);
            if (pv.getName().equals(propertyValue.getName())) {
                this.properties.set(i, propertyValue);
                return this;
            }
        }
        this.properties.add(propertyValue);
        return this;
    }

    /**
     * 判断当前集合是否有此属性
     * @param propertyName 属性名
     * @return 判断结果
     */
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
