package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 17:02
 */
public class DependTest {
    @Test
    /*这里被依赖的一般都是前置条件，例如登录啊等等*/
    public void test1() {
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run");
    }
}
