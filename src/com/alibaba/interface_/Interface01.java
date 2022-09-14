package com.alibaba.interface_;

/**
 * 项目名：    chapter10
 * 文件名：    Interface01
 * 创建时间：   2022/8/26 15:58
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();
        computer.work(phone);
        System.out.println("=============");
        computer.work(camera);
        //InterfaceA.ok();
    }
}
