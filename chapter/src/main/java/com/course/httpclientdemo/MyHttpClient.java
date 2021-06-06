package com.course.httpclientdemo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //用来执行get方法
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(get);
        //转string，后接收
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
