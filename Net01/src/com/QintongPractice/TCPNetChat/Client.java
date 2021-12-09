package com.QintongPractice.TCPNetChat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 8889;
        Socket socket = new Socket(address, port);

        OutputStream os = socket.getOutputStream();
        os.write("xjfnb".getBytes());

        os.close();
        socket.close();

    }
}
