package com.arief.annotated;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ServerEndpoint("/websocket-annotated")
public class AnnotatedEndpoint {


    private Session session;
    static List<Session> sessionList = new CopyOnWriteArrayList<>();


    @OnOpen
    public void onOpen(Session session){
        sessionList.add(session);
    }

    @OnMessage
    public void onMessage(String message){
        System.out.println("onMessage server");
        broadcastMessage(message);
    }

    @OnClose
    public void onClose(Session session , CloseReason closeReason){
        sessionList.remove(session);
        System.out.println("onClose : " + closeReason.getReasonPhrase());
    }

    @OnError
    public void onError(Session session ,  Throwable throwable){

    }

    private void broadcastMessage(String message){
        sessionList.forEach((s)->{
            try {
                s.getBasicRemote().sendText(message);
            } catch (IOException e) {
                try {
                    s.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        });
    }
}
