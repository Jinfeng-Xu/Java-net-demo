package com.QintongPractice.TCPUpload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 1818);

        OutputStream os = socket.getOutputStream();

        FileInputStream fileInputStream = new FileInputStream(new File("Net01/source/Dog.jpg"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len=fileInputStream.read(buffer))!=-1){
            os.write(buffer,0, len);
        }

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2=inputStream.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }
        System.out.println(baos.toString());


        baos.close();
        inputStream.close();
        fileInputStream.close();
        os.close();
        socket.close();

    }
}
