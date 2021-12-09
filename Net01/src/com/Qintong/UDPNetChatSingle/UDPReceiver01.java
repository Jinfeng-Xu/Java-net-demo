package com.Qintong.UDPNetChatSingle;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);

        //准备接受包裹
        while (true) {
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);

            //断开连接 bye
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, packet.getLength());

            System.out.println(receiveData);
            if(receiveData.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
