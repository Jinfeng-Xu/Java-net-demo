package com.Qintong.UDPNetChatMult;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPTalkReceiver implements Runnable{

    DatagramSocket socket = null;

    private int port;
    private String msgFrom;

    public UDPTalkReceiver(int port, String msgFrom) {
        this.msgFrom = msgFrom;
        this.port = port;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        //准备接受包裹
        while (true) {
            try {
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                socket.receive(packet);

                //断开连接 bye
                byte[] data = packet.getData();
                String receiveData = new String(data, 0, packet.getLength());

                System.out.println(msgFrom +": " + receiveData);
                if(receiveData.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();

    }
}
