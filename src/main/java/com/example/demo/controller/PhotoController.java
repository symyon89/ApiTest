package com.example.demo.controller;

import com.example.demo.model.Photo;
import com.example.demo.service.PhotoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService employeeService) {
        this.photoService = employeeService;
    }

    @GetMapping
    public Flux<Photo> getPhotos(){
        return photoService.getPhotos();
    }

    @GetMapping("/{id}")
    public Mono<Photo> getPhoto(@PathVariable String id){
        return photoService.getPhoto(id);
    }
}
