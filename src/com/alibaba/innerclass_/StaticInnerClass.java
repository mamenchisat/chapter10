package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    StaticInnerClass
 * 创建时间：   2022/8/27 15:14
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer09 outer09 = new Outer09();
        outer09.say();
        //外部其他类使用静态内部类
        Outer09.Inner09 inner09 = new Outer09.Inner09();
        inner09.say();

    }
}
class Outer09{
    private int n1 = 10;
    private static String name = "张三";
    private static void cry(){

    }
    static class Inner09{
        public void say(){
            System.out.println("name");
            cry();
        }
    }
    public void say(){
        Inner09 inner09 = new Inner09();
        inner09.say();
    }
}