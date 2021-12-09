package com.QintongPractice.Net;

import java.net.InetSocketAddress;

public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("www.baidu.com",8080);
        System.out.println(address.getPort());
        System.out.println(address.getHostName());
        System.out.println(address.getHostString());
        System.out.println(address.getAddress());
    }
}
