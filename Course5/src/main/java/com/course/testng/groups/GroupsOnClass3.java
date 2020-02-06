package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 11:41
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teache1() {
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
    public void teacher2() {
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
