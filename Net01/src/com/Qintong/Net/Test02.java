package com.Qintong.Net;

import java.net.InetSocketAddress;

public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress address1 = new InetSocketAddress("www.baidu.com", 8080);
        System.out.println(address1.getAddress());
        System.out.println(address1.getHostName());
        System.out.println(address1.getHostString());
        System.out.println(address1.getPort());
    }
}
