package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    Abstract01
 * 创建时间：   2022/8/26 15:04
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Abstract01 {
    //Animal animal = new Animal();
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}