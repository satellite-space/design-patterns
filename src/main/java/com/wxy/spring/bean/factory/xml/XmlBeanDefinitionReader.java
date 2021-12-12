package com.wxy.spring.bean.factory.xml;

import com.wxy.spring.bean.BeanDefinition;
import com.wxy.spring.bean.MutablePropertyValues;
import com.wxy.spring.bean.PropertyValue;
import com.wxy.spring.bean.factory.support.BeanDefinitionReader;
import com.wxy.spring.bean.factory.support.BeanDefinitionRegistry;
import com.wxy.spring.bean.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * description: xml注册表解析类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 17:57
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        InputStream in = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        SAXReader reader = new SAXReader();
        Document document = reader.read(in);
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        for (Element element : elements) {
            BeanDefinition beanDefinition = new BeanDefinition();
            String id = element.attributeValue("id");
            String clazz = element.attributeValue("class");
            MutablePropertyValues propertyValues = new MutablePropertyValues();
            List<Element> properties = element.elements();
            for (Element property : properties) {
                String name = property.attributeValue("name");
                String ref = property.attributeValue("ref");
                String value = property.attributeValue("value");
                PropertyValue pv = new PropertyValue(name, ref, value);
                propertyValues.addPropertyValue(pv);
            }
            beanDefinition.setId(id);
            beanDefinition.setClazz(clazz);
            beanDefinition.setProperties(propertyValues);
            registry.addBeanDefinition(id, beanDefinition);
        }
    }
}
