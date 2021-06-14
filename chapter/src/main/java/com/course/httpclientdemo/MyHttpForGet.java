package com.course.httpclientdemo;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class MyHttpForGet {
    private String url;
    //用来读取配置信息
    private ResourceBundle bundle;
    //用来存储cookie信息的变量
    private CookieStore store;

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
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        //转string，后接收
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
        //获取cookies信息
        //获取一个对象，叫 CookieStore，它把所有的信息都记录下来了
         this.store = client.getCookieStore();
        //获取cookie信息，返回cookies的泛型，类型为Cookie
        List<Cookie> cookieList = store.getCookies();
        //循环读取cookie
        for(Cookie cookie:cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name="+name+"\tcookie value="+value);
        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetDemoCookies() throws IOException {
        String uri = bundle.getString("testGetDemoCookies");
        String testUrl = this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        //用来执行get方法
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行请求
        HttpResponse response = client.execute(get);
        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        if(statusCode==200){
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(result);
        }



    }
}
