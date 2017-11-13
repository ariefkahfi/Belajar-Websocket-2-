//package com.arief.endpointconfig;
//
//import com.arief.messagehandler.MyPartialMessageHandler;
//import com.arief.messagehandler.MyWholeMessageHandler;
//
//import javax.websocket.CloseReason;
//import javax.websocket.Endpoint;
//import javax.websocket.EndpointConfig;
//import javax.websocket.Session;
//
////@Deprecated
////public class MyEndpointConfig extends Endpoint {
////    @Override
////    public void onClose(Session session, CloseReason closeReason) {
////        super.onClose(session, closeReason);
////    }
////
////    @Override
////    public void onError(Session session, Throwable thr) {
////        super.onError(session, thr);
////    }
////
////    public void onOpen(Session session, EndpointConfig endpointConfig) {
////       session.addMessageHandler(new MyWholeMessageHandler(session.getBasicRemote()));
////
//////         session.addMessageHandler(new MyPartialMessageHandler(session.getBasicRemote()));
////
////       System.out.println("on Open");
////    }
////}
