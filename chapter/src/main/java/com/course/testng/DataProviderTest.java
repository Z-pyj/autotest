package com.course.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "methodTest")
    public void test1(String name, String age){
        System.out.println("test1方法中name:"+name+"\tage:"+age);
    }

    @Test(dataProvider = "methodTest")
    public void test2(String name, String age){
        System.out.println("test2方法中name:"+name+"\tage:"+age);
    }

    //根据方法名，传入不同的参数化值
    @DataProvider(name="methodTest")
    public Object[][] methodTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"李四","31"},
                    {"赵六","44"},
                    {"王五","66"},
                    {"赵四","99"},
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"王五","64"},
                    {"赵四","12"},
                    {"李四","32"},
                    {"赵六","43"},
            };
        }
        return result;
    }
}
