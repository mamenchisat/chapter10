package com.alibaba.interface_;

/**
 * 项目名：    chapter10
 * 文件名：    Camera
 * 创建时间：   2022/8/26 16:01
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Camera implements UsbInterface {

    @Override
    public void start() {
        System.out.println("照相机开始工作。。");
    }

    @Override
    public void stop() {
        System.out.println("照相机停止工作。。");
    }
}
