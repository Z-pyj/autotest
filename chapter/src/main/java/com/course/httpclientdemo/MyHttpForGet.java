package com.course.httpclientdemo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ResourceBundle;

public class MyHttpForGet {
    private String url;
    //用来读取配置信息
    private ResourceBundle bundle;

    @BeforeMethod
    public void beforeTest(){
        //读取配置文件
        bundle = ResourceBundle.getBundle("application");
        //获取url
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //拼接url
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        //用来执行get方法
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(get);
        //转string，后接收
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
