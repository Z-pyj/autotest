package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupStudent2 {
    public void testStuent1(){
        System.out.println("stu组的student2方法1");
    }

    public void testStuent2(){
        System.out.println("stu组的student2方法2");
    }
}
