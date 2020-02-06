package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 16:45
 */
public class ExpectedException {
    /**
     * 什么时候会用到异常测试？
     * 在我们的期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我的一起结果就是这个异常
     */
    //  这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFalied() {
        System.out.println("这是一个失败的异常测试");
    }

    //  这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();/*抛异常*/
    }
}