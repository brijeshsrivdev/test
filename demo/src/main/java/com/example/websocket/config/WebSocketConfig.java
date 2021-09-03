package com.example.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    //Demo for index.html
    ////    @Override
    ////    public void registerStompEndpoints(StompEndpointRegistry registry) {
    ////        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    ////    }

//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        /*
//        * The simple broker is great for getting started, but it has a few limitations.
//        * Although it mimics a STOMP message broker, it only supports a subset of STOMP commands.
//        * And because it’s memory-based, it’s not suitable for clusters where each node would be
//        * managing its own broker and set of messages.
//        * */
//        config.enableSimpleBroker("/topic");
//
//    }
//                           config.setApplicationDestinationPrefixes("/app");
//



    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/live-temperature").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
    }

}