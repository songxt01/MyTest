package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 21:43
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1() {
        System.out.println("1");
        System.out.printf("Thread id = %s%n",Thread.currentThread().getId());
    }
}
