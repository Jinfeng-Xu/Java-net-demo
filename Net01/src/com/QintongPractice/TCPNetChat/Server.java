package com.QintongPractice.TCPNetChat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8889);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while((len=inputStream.read(buffer))!=-1){
            baos.write(buffer, 0, len);
        }
        System.out.println(baos.toString());

        baos.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
