package com.example.demo.mapper;


import com.example.demo.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseUrlMapper {
    @Autowired
    ConfigProperties configProperties;

    public String mapToBaseUrl(String apiUrl) {
        return apiUrl !=null ? configProperties.getBaseurl() + "/photo/" + apiUrl  : null;
    }

}
