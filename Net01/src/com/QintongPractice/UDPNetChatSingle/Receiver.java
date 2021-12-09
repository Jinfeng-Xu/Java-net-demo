package com.QintongPractice.UDPNetChatSingle;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(2999);

        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
            socket.receive(packet);

            byte[] datas =  packet.getData();
            String recieveDatas = new String(datas,0, packet.getLength());
            System.out.println(recieveDatas);

            if(recieveDatas.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
