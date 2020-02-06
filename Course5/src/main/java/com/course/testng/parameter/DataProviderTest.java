package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by sxt on 2020-02-05 17:25
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age) {
        System.out.println("name =" + name + " ; "+ "age = "+ age);
    }
    /*下面是参数数据来源*/
    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",30},
                {"wangwu",80}
        };
        return o;
    }


    /*通过不同的方法名传递不同的参数*/
    @Test(dataProvider = "methodData")
    public void test1(String name,int age) {
        System.out.println("test111方法的 name =" + name + " ; "+ "age = "+ age);

    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age) {
        System.out.println("test222方法的 name =" + name + " ; "+ "age = "+ age);
    }
    @DataProvider(name = "methodData")
//    为什么要加method？
//    method自动会把test1和test2传递进来，因为他们是关联的
    public Object[][] methodDataTest(Method method) {
//        方法不一样给result赋值
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][] {
                    {"zhangsan",20},
                    {"lisi",15}
            };
        }else if (method.getName().equals("test2")) {
            result = new Object[][] {
                    {"wangwu",99},
                    {"zhaoliu",100}
            };
        }
        return result;
    }

}

