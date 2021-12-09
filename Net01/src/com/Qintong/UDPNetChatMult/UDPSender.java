package com.Qintong.UDPNetChatMult;

//双方都说bye才是真的bye
public class UDPSender {
    public static void main(String[] args) {
        new Thread(new UDPTalkSender(7777,"localhost",9999)).start();
        new Thread(new UDPTalkReceiver(8888,"User2")).start();
    }
}
