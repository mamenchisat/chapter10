package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    AA
 * 创建时间：   2022/8/26 15:22
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class AA {

    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间是：" + (end - start) + "ms");
    }
    //计算任务
    public void job() {
        //得到开始的时间
        long num = 0;
        for (long i = 0; i <= 8800000; i++) {
            num += i;
        }
    }
}
