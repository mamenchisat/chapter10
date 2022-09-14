package com.alibaba.interface_;

/**
 * 项目名：    chapter10
 * 文件名：    Computer
 * 创建时间：   2022/8/26 16:04
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Computer {
    //
    public void work(UsbInterface usbInterface) {
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
