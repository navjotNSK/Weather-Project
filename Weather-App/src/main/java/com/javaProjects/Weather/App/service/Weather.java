package com.javaProjects.Weather.App.service;

import com.javaProjects.Weather.App.dto.WeatherResponseDto;
import com.javaProjects.Weather.App.dto.WeatherResponseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Weather {

    @Autowired
    private  final RestTemplate restTemplate;

    public Weather(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    private WeatherResponseTransformer weatherResponseTransformer;

    public WeatherResponseDto getData(String country){
        Object ob = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=" +  country + "&appid=599d27fdc9e2c25e9f78e278392fc50b",Object.class);
        return weatherResponseTransformer.apply(ob);
    }



}
