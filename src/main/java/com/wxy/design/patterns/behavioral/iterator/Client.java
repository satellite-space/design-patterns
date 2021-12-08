package com.wxy.design.patterns.behavioral.iterator;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:47
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", 1));
        studentAggregate.addStudent(new Student("李四", 2));
        studentAggregate.addStudent(new Student("王五", 3));
        studentAggregate.addStudent(new Student("赵六", 4));

        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
    }
}
