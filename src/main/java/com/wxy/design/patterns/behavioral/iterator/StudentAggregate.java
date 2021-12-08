package com.wxy.design.patterns.behavioral.iterator;

/**
 * description: 抽象聚合角色类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:42
 */
public interface StudentAggregate {

    /**
     * 添加学生
     * @param student 学生
     */
    void addStudent(Student student);

    /**
     * 删除学生
     * @param student 学生
     */
    void deleteStudent(Student student);

    /**
     * 获取学生类的迭代器
     * @return 学生类迭代器
     */
    StudentIterator getStudentIterator();
}
