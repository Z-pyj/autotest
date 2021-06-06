package com.course.testng.multthread;

import org.testng.annotations.Test;

public class MultThreadTest {

    //invocationCount设置多线程，threadPoolSize设置线程池大小
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println(12);
        System.out.printf("当前线程ID %s%n",Thread.currentThread().getId());
    }
}
