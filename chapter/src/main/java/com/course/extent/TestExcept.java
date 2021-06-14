package com.course.extent;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExcept {
    @Test
    public void test1(){
        Assert.assertEquals(1,10);
    }

    @Test
    public void test2(){
        Assert.assertEquals("test","test");
    }

    @Test
    public void test3() {
        Reporter.log("这是自己写的日志");
        throw new RuntimeException("这是我们自己运行时异常");
    }
}
