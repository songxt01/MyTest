package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by sxt on 2020-01-14 13:21
 */
public class TestMethodsdemo {
    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2() {
        Assert.assertEquals(1,1);
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我自己的日志");
        throw new RuntimeException("我抛的异常");
    }
}
