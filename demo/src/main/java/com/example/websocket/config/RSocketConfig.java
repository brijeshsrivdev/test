package com.example.websocket.config;

public class RSocketConfig {
//    @Bean
//    public RSocketStrategies rSocketStrategies() {
//        return RSocketStrategies.builder()
//                .encoders(encoders -> encoders.add(new Jackson2CborEncoder()))
//                .decoders(decoders -> decoders.add(new Jackson2CborDecoder()))
//                .build();
//    }
//
//
//
//    @Bean
//    public Mono<RSocketRequester> getRSocketRequester(RSocketRequester.Builder builder){
//        return builder
//                .rsocketConnector(rSocketConnector -> rSocketConnector.reconnect(Retry.fixedDelay(2, Duration.ofSeconds(2))))
//                .dataMimeType(MediaType.APPLICATION_CBOR)
//                .connectTcp("localhost", 9898).retry(5).cache();
//    }
}
