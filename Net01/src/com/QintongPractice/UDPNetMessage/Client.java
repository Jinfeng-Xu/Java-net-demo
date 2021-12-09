package com.QintongPractice.UDPNetMessage;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String msg = "xjf2333";
        int port = 9919;
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, address, port);

        socket.send(packet);
        socket.close();
    }
}
