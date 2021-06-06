package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "server")
    public void server1(){
        System.out.println("服务端测试用例1");
    }

    @Test(groups = "server")
    public void server2(){
        System.out.println("服务端测试用例2");
    }

    @Test(groups = "client")
    public void client1(){
        System.out.println("客户端测试用例1");
    }

    @Test(groups = "client")
    public void client2(){
        System.out.println("客户端测试用例2");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("在服务端测试之前开始执行");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("在服务端测试之后开始执行");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("在客户端测试之前开始执行");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("在客户端测试之后开始执行");
    }

}
