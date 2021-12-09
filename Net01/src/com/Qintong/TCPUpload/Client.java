package com.Qintong.TCPUpload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        //创建输出流
        OutputStream os = socket.getOutputStream();
        //读取文件
        FileInputStream file = new FileInputStream(new File("Net01/source/Dog.jpg"));
        //写出文件
        byte[] buffer = new byte[1024];
        int len;
        while((len=file.read(buffer))!=-1){
            os.write(buffer,0, len);
        }

        //通知服务器，我结束了
        socket.shutdownOutput();
        //确认服务器接收完毕，才能够断开连接
        InputStream is = socket.getInputStream();
        //String byte[]
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer2 = new byte[1024];
        int len2;
        while((len2=is.read(buffer2))!=-1){
            baos.write(buffer2,0, len2);
        }

        System.out.println(baos.toString());

        //关闭资源
        baos.close();
        is.close();
        file.close();
        os.close();
        socket.close();

    }
}
