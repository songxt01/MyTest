package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-06 15:09
 */
public class MultiThreadOnXml {
    @Test
    public void test1() {
        System.out.printf("Thread id = %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread id = %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread id = %s%n", Thread.currentThread().getId());
    }
}
