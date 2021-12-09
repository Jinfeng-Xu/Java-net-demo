package com.Qintong.TCPNetChat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    //客户端
    public static void main(String[] args) {

        Socket socket = null;
        OutputStream os = null;


        try {
            //获取服务器地址，端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9992;
            //创建一个socket链接
            socket = new Socket(serverIP, port);
            //发送消息IO流
            os = socket.getOutputStream();
            os.write("xjf666".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
