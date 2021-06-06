package com.course.testng;

import org.testng.annotations.Test;

public class DepandTest {
    @Test
    public void test1(){
        System.out.println("test2方法的依赖");
        //故意抛出RuntimeException异常
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2方法依赖test1方法，test1方法失败，会忽略该方法，test1成功才会执行test2");
    }
}
