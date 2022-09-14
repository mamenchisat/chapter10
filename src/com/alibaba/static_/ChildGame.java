package com.alibaba.static_;

/**
 * 项目名：    chapter10
 * 文件名：    ChildGame
 * 创建时间：   2022/8/25 11:28
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ChildGame {
    public static void main(String[] args) {
        int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
        count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        count++;

        Child child3 = new Child("老鼠精");
        child3.join();
        count++;

        System.out.println("共有" + count + "小孩加入了游戏。。。");
    }
}

class Child {
    private String name;
    //会被所有的Child实例共享
    public static int count = 0;


    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏。。");
    }

}