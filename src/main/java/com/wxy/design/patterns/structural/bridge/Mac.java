package com.wxy.design.patterns.structural.bridge;

/**
 * description: 扩展抽象化角色——mac系统
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:27
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
