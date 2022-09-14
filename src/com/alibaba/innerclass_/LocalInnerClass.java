package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    LocalInnerClass
 * 创建时间：   2022/8/26 19:32
 *
 * @author crazy Chen
 * 描述：      TODO
 */
//演示局部内部类

public class LocalInnerClass {
    public static void main(String[] args) {
        //外部其他类不能访问局部内部类
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02{
    //外部类
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2()");
    }
    public void m1(){
        //局部内部类是定义在外部类的局部位置，通常是在方法
        class inner02 {
            //不能添加访问修饰符，但是可以用final修饰,表示不能被继承
            //可以直接访问外部类的所有成员，包括私有的
            //作用域只能在定义它的方法或者代码块中
            public void f1(){
                //如果外部类和局部内部类的成员重名，遵循就近原则
                int n1 = 101;
                System.out.println("n1="+n1);
                System.out.println("=============");
                System.out.println("n1="+Outer02.this.n1);
                m2();
            }
        }
        class inner03 extends inner02{ }
        //外部类在方法中可以创建 inner02的对象实例，然后调用方法即可,但是必须在该内部类的作用域内
        inner02 inner02 = new inner02();
        inner02.f1();
    }
}