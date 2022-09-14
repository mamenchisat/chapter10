package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    Template
 * 创建时间：   2022/8/26 15:21
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class TemplateTest {
    //模板设计模式
    public static void main(String[] args) {
//        AA aa = new AA();
//        BB bb = new BB();
//        aa.calculateTime();
//        bb.calculateTime();

        //下面用模板模式设计代码
        AbstractAA abstractAA = new AbstractAA();
        AbstractBB abstractBB = new AbstractBB();
        abstractAA.calculateTime();
        abstractBB.calculateTime();

    }
}
