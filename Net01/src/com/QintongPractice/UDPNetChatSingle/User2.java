package com.QintongPractice.UDPNetChatSingle;

import com.Qintong.UDPNetChatMult.UDPTalkReceiver;
import com.Qintong.UDPNetChatMult.UDPTalkSender;
import com.QintongPractice.UDPNetChatMult.Receiver;
import com.QintongPractice.UDPNetChatMult.Sender;

public class User2 {
    public static void main(String[] args) {
        new Thread(new Sender(5555, "localhost",8888)).start();
        new Thread(new Receiver(9999,"User1")).start();
    }
}
