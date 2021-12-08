package com.wxy.design.patterns.behavioral.iterator;

import java.util.List;

/**
 * description: 具体迭代器
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:34
 */
public class StudentIteratorImpl implements StudentIterator {

    /**
     * 集合元素
     */
    private List<Student> list;

    /**
     * 位置坐标
     */
    private int pos;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return pos <= list.size() - 1;
    }

    @Override
    public Student next() {
        return list.get(pos++);
    }
}
