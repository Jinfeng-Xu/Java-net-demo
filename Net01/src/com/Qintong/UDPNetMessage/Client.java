package com.Qintong.UDPNetMessage;

import java.io.IOException;
import java.net.*;

//不需要连接服务器
//发送端
public class Client {
    public static void main(String[] args) throws IOException {
        //建立一个socket
        DatagramSocket socket = new DatagramSocket();
        //建立包
        String msg = "hello,server";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);
        //发送包
        socket.send(packet);
        //关闭socket
        socket.close();
    }
}
