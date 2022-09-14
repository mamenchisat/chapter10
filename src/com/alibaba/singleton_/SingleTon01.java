package com.alibaba.singleton_;

/**
 * 项目名：    chapter10
 * 文件名：    SingleTon01
 * 创建时间：   2022/8/25 19:10
 *
 * @author crazy Chen
 * 描述：    饿汉式的单例模式  TODO
 */
public class SingleTon01 {

    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }

}

class GirlFriend {
    public int n1 = 100;
    private String name;
    //饿汉式单例模式,有可能还未使用对象，但是对象已经创建好了
    //如何保证只能创建一个单例
    //第一步私有化构造器
    //第二步在类的内部直接创建一个
    //第三步提供一个公共的static方法返回gf对象
    private static GirlFriend xh = new GirlFriend("xiaoHong");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return xh;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
