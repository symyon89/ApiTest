package com.example.demo.service;

import com.example.demo.model.Photo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PhotoService {

    private final WebClient webClient;

    public PhotoService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<Photo> getPhotos(){
        return webClient.get()
                .uri("photos/")
                .retrieve()
                .bodyToFlux(Photo.class);
    }

    public Mono<Photo> getPhoto(String id){
        return webClient.get()
                .uri("photos/" + id)
                .retrieve()
                .bodyToMono(Photo.class);
    }
}
