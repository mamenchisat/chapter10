package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    MemberInnerClass
 * 创建时间：   2022/8/27 12:04
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        new Outer08().t1();
        //外部其它类使用成员内部类的方法
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    public class Inner08 {
        public void say() {
            //成员内部类，是定义在外部类的成员位置上
            //可以直接访问外部类的成员，不管是不是私有的
            System.out.println("n1= " + n1 + " name= " + name);
        }
    }
    //写一个方法
    public void t1(){
        new Inner08().say();
    }
}