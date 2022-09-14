package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    InnerClass01
 * 创建时间：   2022/8/26 19:24
 *
 * @author crazy Chen
 * 描述：      TODO
 * //类的五大属性，
 *     //属性；方法；构造器，代码块，内部类
 *     //注意，内部类是学习的难点，也是重点
 */
public class InnerClass01 {//外部其他类
}
class Outer{//内部类
    private int n1 = 100;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }

    public void m1(){//方法
        System.out.println("m1()");
    }
    {
        System.out.println("代码块...");
    }

    class Inner{
        //成员内部类
    }
}