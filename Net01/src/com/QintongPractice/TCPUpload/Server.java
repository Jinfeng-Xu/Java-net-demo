package com.QintongPractice.TCPUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1818);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        FileOutputStream fileOutputStream = new FileOutputStream(new File("Net01/source/TCPUploadTest.jpg"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            fileOutputStream.write(buffer,0, len);
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("完事儿了".getBytes());


        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
