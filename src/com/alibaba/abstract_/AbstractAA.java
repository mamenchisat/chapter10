package com.alibaba.abstract_;

/**
 * 项目名：    chapter10
 * 文件名：    AbstractAA
 * 创建时间：   2022/8/26 15:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class AbstractAA extends Template{
    @Override
    public void job() {
        //得到开始的时间
        long num = 0;
        for (long i = 0; i <= 8800000; i++) {
            num += i;
        }
    }
}
