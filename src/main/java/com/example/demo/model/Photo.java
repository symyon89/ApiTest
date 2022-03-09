package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.example.demo.mapper.BaseUrlMapper;
import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Photo {
    @Autowired
    BaseUrlMapper baseUrlMapper;

    private Integer albumId;
    private String id;
    private String title;
    private String url;
    private String thumbnailUrl;

    @JsonProperty("id")
    public void setId(String id) {
        this.id = baseUrlMapper.mapToBaseUrl(id);
    }
}

