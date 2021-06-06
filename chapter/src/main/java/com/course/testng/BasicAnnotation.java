package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //@Test注解，用来把方法标识为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用来1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用来2");
    }

    //BeforeMethod方法在测试方法之前运行
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("BeforeMethod方法在测试方法之前运行");
    }

    //AfterMethod方法在测试方法之后运行
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod方法在测试方法之后运行");
    }

    @BeforeClass
    public void testBeforClass(){
        System.out.println("BeforeClass方法在测试类之后运行");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("AfterClass方法在测试类之后运行");
    }
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("BeforeSuit方法测试套件之前执行");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("AfterSuite方法测试套件之后执行");
    }

}
