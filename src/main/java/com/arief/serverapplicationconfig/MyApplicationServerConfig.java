//package com.arief.serverapplicationconfig;
//
//import com.arief.endpointconfig.MyEndpointConfig;
//
//import javax.websocket.Endpoint;
//import javax.websocket.server.ServerApplicationConfig;
//import javax.websocket.server.ServerEndpointConfig;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.logging.Logger;
//
//
//
////public class MyApplicationServerConfig implements ServerApplicationConfig {
////
////    private Logger logger =Logger.getLogger(MyApplicationServerConfig.class.getName());
////
////    public MyApplicationServerConfig() {
////        logger.info("calling " + this.getClass().getName());
////    }
////
////    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> set) {
////        logger.info("configuring getEndpointConfigs.....");
////        Set<ServerEndpointConfig> serverEndpointConfigs = new HashSet<ServerEndpointConfig>();
////
////        if(set.contains(MyEndpointConfig.class)){
////            serverEndpointConfigs.add(
////                    ServerEndpointConfig
////                            .Builder
////                            .create(MyEndpointConfig.class,"/echo")
////                            .build());
////        }
////
////        return serverEndpointConfigs;
////    }
////
////    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> set) {
////        return null;
////    }
////}
