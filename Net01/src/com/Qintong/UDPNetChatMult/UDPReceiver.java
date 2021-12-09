package com.Qintong.UDPNetChatMult;

//双方都说bye才是真的bye
public class UDPReceiver {
    public static void main(String[] args) {
        new Thread(new UDPTalkSender(5555, "localhost",8888)).start();
        new Thread(new UDPTalkReceiver(9999,"User1")).start();
    }
}
