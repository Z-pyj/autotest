package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("suite开始执行");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("suite结束执行");
    }
}
