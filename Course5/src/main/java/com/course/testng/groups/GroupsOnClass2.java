package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-02-05 11:41
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void sut1() {
        System.out.println("GroupsOnClass2中的stu1运行");
    }
    public void stu2() {
        System.out.println("GroupsOnClass2中的stu2运行");
    }
}
