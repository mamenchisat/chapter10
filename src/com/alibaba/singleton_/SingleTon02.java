package com.alibaba.singleton_;

/**
 * 项目名：    chapter10
 * 文件名：    SingleTon01
 * 创建时间：   2022/8/25 19:10
 *
 * @author crazy Chen
 * 描述：    懒汉式的单例模式  TODO
 */
public class SingleTon02 {

    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat cat = Cat.getInstance();
        System.out.println(cat);
    }

}

class Cat {
    private String name;
    private static Cat cat;
    public static int n1 = 1000;

    //任然构造器私有化
    //第二步定义一个静态属性对象
    //提供一个公共static方法，可以返回一个cat对象
    //懒汉式，只有当用户使用getInstance时才返回cat对象，后面再次调用时会返回上次创建的cat对象
    //从而保障了单例。
    private Cat(String name) {
        System.out.println("构造器被调用~");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
