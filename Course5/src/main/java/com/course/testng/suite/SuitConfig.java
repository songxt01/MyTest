package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by sxt on 2020-02-04 16:10
 */
public class SuitConfig {
    @BeforeSuite
    public void  beforeSuite() {
        System.out.println("Beforesuite运行啦！~");
    }

    @AfterSuite
    public void  afterSuite() {
        System.out.println("AfterSuite运行啦！~");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }
}
