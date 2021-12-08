package com.wxy.design.patterns.behavioral.iterator;

/**
 * description: 抽象迭代器
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:33
 */
public interface StudentIterator {

    /**
     * 是否存在下一个对象
     * @return 判断结果
     */
    boolean hasNext();

    /**
     * 获取迭代器后面的元素
     * @return 下一个元素
     */
    Student next();
}
