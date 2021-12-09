package com.QintongPractice.UDPNetChatSingle;

import com.Qintong.UDPNetChatMult.UDPTalkReceiver;
import com.Qintong.UDPNetChatMult.UDPTalkSender;
import com.QintongPractice.UDPNetChatMult.Receiver;
import com.QintongPractice.UDPNetChatMult.Sender;

public class User1 {
    public static void main(String[] args) {
        new Thread(new Sender(7777,"localhost",9999)).start();
        new Thread(new Receiver(8888,"User2")).start();
    }

}
