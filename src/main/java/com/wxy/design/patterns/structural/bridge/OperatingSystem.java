package com.wxy.design.patterns.structural.bridge;

/**
 * description: 抽象化角色——操作系统类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 21:24
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 文件播放类
     * @param fileName 文件名
     */
    public abstract void play(String fileName);
}
