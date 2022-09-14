package com.alibaba.innerclass_;

/**
 * 项目名：    chapter10
 * 文件名：    InnerClassExercise
 * 创建时间：   2022/8/27 10:04
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了~");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了~");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}