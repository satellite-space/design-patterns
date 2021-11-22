package com.wxy.design.patterns.structural.bridge;

/**
 * description: 具体实现化角色——rmvb视频文件
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:23
 */
public class RmvbFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("rmvb文件解析，文件名为：" + fileName);
    }
}
