//package com.example.websocket.config;
//
//import com.example.websocket.ssample.MarcoHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@EnableWebSocket
//public class WebSocketConfigAnother implements WebSocketConfigurer {
//
//    @Override
//    public void registerWebSocketHandlers(
//            WebSocketHandlerRegistry registry) {
//        registry.addHandler(marcoHandler(), "/marco");
//    }
//
//    @Bean
//    public MarcoHandler marcoHandler() {
//        return new MarcoHandler();
//    }
//}
