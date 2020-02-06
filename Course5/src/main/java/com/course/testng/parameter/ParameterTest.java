package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 17:08
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age) {
        System.out.println("name = "+ name + " ; wwwwww"+ "age ="+ age);
    }
}
