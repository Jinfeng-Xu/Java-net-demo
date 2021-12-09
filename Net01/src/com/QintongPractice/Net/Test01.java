package com.QintongPractice.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address4399 = InetAddress.getByName("www.4399.com");
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println("4399's address: " + address4399.getHostAddress());
        System.out.println("baidu's address: " + address.getHostAddress());
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getAddress());
        System.out.println(address.getHostName());
    }
}
