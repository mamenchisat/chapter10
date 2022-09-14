package com.alibaba.interface_;

/**
 * 项目名：    chapter10
 * 文件名：    InterfaceA
 * 创建时间：   2022/8/26 17:52
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public interface InterfaceA {
    //属性
    public int n1 = 1;

    //方法
    public void hi();

    //jdk8之后，可以有默认实现方法,默认方法或者静态方法
    public static void ok() {
        System.out.println("ok");
    }

    default public void ojbk() {
        System.out.println("ojbk");
    }

}

class A implements InterfaceA {

    @Override
    public void hi() {
        System.out.println("hi");
    }


}
