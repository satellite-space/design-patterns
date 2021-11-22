package com.wxy.design.patterns.structural.bridge;

/**
 * description: 扩展抽象化角色——windows操作系统
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:25
 */
public class Windows extends OperatingSystem {

    public Windows(VideoFile file) {
        super(file);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
