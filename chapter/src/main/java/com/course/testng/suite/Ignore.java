package com.course.testng.suite;

import org.testng.annotations.Test;

public class Ignore {

    @Test
    public void ignoreTest1(){
        System.out.println("ignore1被执行");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignore2被执行");
    }
}
