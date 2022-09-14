package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    Template
 * 创建时间：   2022/8/26 15:40
 *
 * @author crazy Chen
 * 描述：      TODO
 */
abstract class Template {
    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间是：" + (end - start) + "ms");
    }
}
