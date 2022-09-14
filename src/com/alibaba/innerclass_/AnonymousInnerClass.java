package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    AnonymousInnerClass
 * 创建时间：   2022/8/26 20:19
 *
 * @author crazy Chen
 * 描述：      TODO
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //需求：想使用接口IA，并创建对象
        //传统方式，写一个类，实现该接口，并创建对象
        //但是现在有一个需求，我可能Tiger只用一次，以后再也不使用了，显得有些啰嗦
//        Tiger tiger = new Tiger();
//        tiger.cry();
        //可以使用匿名内部类来简化开发
        //tiger 编译类型IA
        //tiger 运行类型就是匿名内部类xxxx==>Outer$01
        /*
            我们看底层
         class xxxx implements IA {
            @Override
            public void cry() {
               System.out.println("老虎叫唤。。");
         }
}
            }
         */
        IA tiger = new IA() {
            //基于接口的匿名内部类
            @Override
            public void cry() {
                System.out.println("老虎叫唤。。。");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型" + tiger.getClass());

        // father编译类型Father
        // father运行类型Outer04$2
        // 底层会创建匿名内部类
        Father jack = new Father("jack") {
            //基于类的匿名内部类
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test()");
            }
        };
        System.out.println("father对象的运行类型=" + jack.getClass());
        jack.test();

        new Animal() {
            @Override
            void eat() {
                System.out.println("匿名内部类的eat()");
            }
        }.eat();
        System.out.println("animal的运行类型" + this.getClass());
        //animal.eat();
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤。。");
//    }
//}
//
//class Dog implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("狗在叫唤");
//    }
//}

class Father {

    public Father(String name) {

    }

    public void test() {

    }
}

abstract class Animal {
    abstract void eat();
}