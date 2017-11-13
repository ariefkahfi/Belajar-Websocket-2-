package com.arief.messagehandler;

import javax.websocket.MessageHandler;
import javax.websocket.RemoteEndpoint;
import java.io.IOException;


//@Deprecated
//public class MyWholeMessageHandler implements MessageHandler.Whole<String> {
//
//    private RemoteEndpoint.Basic remote;
//
//    public MyWholeMessageHandler(RemoteEndpoint.Basic remote){
//        this.remote=remote;
//    }
//
//
//    public void onMessage(String s) {
//        try {
//            remote.sendText("sent to client : " + s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
