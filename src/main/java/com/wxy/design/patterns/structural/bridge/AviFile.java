package com.wxy.design.patterns.structural.bridge;

/**
 * description: 具体实现化角色——avi视频文件
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:21
 */
public class AviFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi文件解析，文件名为：" + fileName);
    }
}
