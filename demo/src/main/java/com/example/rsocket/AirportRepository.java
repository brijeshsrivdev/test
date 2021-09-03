package com.example.rsocket;

import com.example.rsocket.model.Airport;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class AirportRepository {
    Mono<Airport> findByCode(String code){
        Airport airport = new Airport();
        airport.setGate("GATE-4");
        return Mono.just(airport);
    }
}
