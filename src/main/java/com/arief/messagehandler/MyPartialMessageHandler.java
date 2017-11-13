package com.arief.messagehandler;

import javax.websocket.MessageHandler;
import javax.websocket.RemoteEndpoint;
import java.io.IOException;

//@Deprecated
//public class MyPartialMessageHandler implements MessageHandler.Partial<String> {
//
//    private RemoteEndpoint.Basic remote;
//
//    public MyPartialMessageHandler(RemoteEndpoint.Basic remote) {
//        this.remote = remote;
//    }
//
//    public void onMessage(String s, boolean b) {
//        try {
//            remote.sendText("sent from partial to client : " + s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
