package com.wxy.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 具体聚合类银灰色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:44
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void deleteStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
