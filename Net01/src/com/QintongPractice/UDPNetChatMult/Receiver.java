package com.QintongPractice.UDPNetChatMult;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver implements Runnable{

    DatagramSocket socket = null;

    private int port;
    private String msgFrom;

    public Receiver(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true){
            try {
                byte[] bytes = new byte[1024];
                DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
                socket.receive(packet);
                byte[] datas =  packet.getData();
                String recieveDatas = new String(datas,0, packet.getLength());
                System.out.println(recieveDatas);
                if(recieveDatas.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();

    }
}
