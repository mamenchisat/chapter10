package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    AbstractBB
 * 创建时间：   2022/8/26 15:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class AbstractBB extends Template{
    public void job() {
        //得到开始的时间
        long num = 0;
        for (long i = 0; i <= 800000; i++) {
            num += i;
        }
    }
}
