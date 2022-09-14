package com.alibaba.interface_;

/**
 * 项目名：    chapter10
 * 文件名：    Phone
 * 创建时间：   2022/8/26 15:59
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Phone implements UsbInterface {
    //phone需要实现usb接口声明的方法

    @Override
    public void start() {
        System.out.println("手机开始工作。。");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作。。");
    }
}
