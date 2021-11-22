package com.wxy.design.patterns.structural.adapter.obj;

/**
 * 客户端类
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:40
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        String read = computer.read(sdCard);
        System.out.println(read);

        System.out.println("-------------------");

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        System.out.println(computer.read(sdAdapterTF));
    }
}
