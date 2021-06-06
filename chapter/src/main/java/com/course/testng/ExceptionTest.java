package com.course.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void expectExceptionFailed(){
        System.out.println("预期抛出，RuntimeException异常，实际没有抛出，是失败的用例");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void expectExceptionSuccess(){
        System.out.println("预期抛出，RuntimeException异常，实际成功抛出，是成功的用例");
        throw new RuntimeException();
    }
}
