package com.wxy.design.patterns.structural.bridge;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:28
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());
        system.play("阿凡达");
    }
}
