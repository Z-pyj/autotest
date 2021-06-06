package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupTeacher1 {
    public void testTeacher1(){
        System.out.println("teacher组的teacher1方法1");
    }

    public void testTeacher2(){
        System.out.println("teacher组的teacher1方法2");
    }
}
