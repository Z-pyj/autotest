package com.course.testng.multthread;

import org.testng.annotations.Test;

public class MultThreadXml {
    @Test
    public void test1(){
        System.out.printf("当前线程ID %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("当前线程ID %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("当前线程ID %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test4(){
        System.out.printf("当前线程ID %s%n",Thread.currentThread().getId());
    }
}
