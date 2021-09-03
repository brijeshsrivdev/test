package com.example.rsocket;

import com.example.rsocket.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class ControllerDemo {
    private final AirportRepository airportRepository;

    @Autowired
    ClientRsocket clientRsocket;


    public ControllerDemo(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;

    }
    @MessageMapping("number.stream")
    public Flux<Integer> responseStream(Integer number) {
        return Flux.range(1, number)
                .delayElements(Duration.ofSeconds(1));
    }

    @MessageMapping("number.channel")
    public Flux<Long> biDirectionalStream(Flux<Long> numberFlux) {
        return numberFlux
                .map(n -> n * n)
                .onErrorReturn(-1L);
    }

    @MessageMapping("find.radar.{code}")
    public Mono<Airport> findRadar(@DestinationVariable String code) {
        return this.airportRepository
                .findByCode(code.toUpperCase());
    }

    @GetMapping("/radar/{code}")
    public Mono<Airport> getRadarData(@PathVariable String code){
        return clientRsocket.findRadar(code);
    }
}
