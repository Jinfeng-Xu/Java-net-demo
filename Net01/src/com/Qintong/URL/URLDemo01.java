package com.Qintong.URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=111&password=123");
        System.out.println(url.getProtocol());//协议
        System.out.println(url.getHost());//主机(ip)
        System.out.println(url.getPort());//端口
        System.out.println(url.getPath());//文件地址
        System.out.println(url.getFile());//文件全路径
        System.out.println(url.getQuery());//参数
    }
}

