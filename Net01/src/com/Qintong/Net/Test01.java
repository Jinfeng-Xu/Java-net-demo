package com.Qintong.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1 = InetAddress.getByName("www.baidu.com");
        System.out.println(address1.getHostName());
        System.out.println(address1.getAddress());
        System.out.println(address1.getCanonicalHostName());
        System.out.println(address1.getHostAddress());
    }
}
