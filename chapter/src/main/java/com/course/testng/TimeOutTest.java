package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)//超时测试，期望不超时
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)//期望超时，抛出异常
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
    }
}
