package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by sxt on 2020-02-04 15:48
 */
public class BasicAnnotation {
    @BeforeMethod
    public void beforeMethodP() {
        System.out.println("BeforeMethod方法前运行");

    }
    @Test
    public void testCase1 () {
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod方法后运行");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass这是在类运行前运行的");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass这是在类后运行后运行的");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("这是在BeforeSuit测试套件前执行的");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("这是在AfterSuite测试套件后执行的");

    }

}

