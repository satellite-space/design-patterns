package com.wxy.design.patterns.structural.bridge;

/**
 * description: 实现化角色——视频文件类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:20
 */
public interface VideoFile {

    /**
     * 文件解码
     * @param fileName 文件名
     */
    void decode(String fileName);

}
