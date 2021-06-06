package com.course.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})//传入形参，数组
    public void paramUser(String name, String age){
        System.out.println("name:"+name+" ,age:"+age);
    }
}
