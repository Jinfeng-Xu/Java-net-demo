package com.Qintong.TCPNetChat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //服务器
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;

        try {
            //生成地址
            serverSocket = new ServerSocket(9992);
            //等待客户端连接
            socket = serverSocket.accept();
            //读取客户端消息
            is = socket.getInputStream();

            /*byte[] buffer = new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                String msg = new String(buffer, 0, len);
                System.out.println(msg);
            }*/

            //管道流
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                baos.write(buffer,0, len);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
