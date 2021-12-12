package com.wxy.spring.util;

/**
 * description: 自定义spring工具类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 20:44
 */
public class StringUtils {
    /**
     * 将属性名转换为方法名
     * @param propertyName 属性名
     * @return get/set方法
     */
    public static String getSetterMethodNameByFieldName(String propertyName) {
        return "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
    }
}
