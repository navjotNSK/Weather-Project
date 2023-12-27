package com.javaProjects.Weather.App.controller;

import com.javaProjects.Weather.App.service.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {
    private final Weather weatherService;

    @Autowired
    public WeatherController(Weather weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/publish/{country}")
    public Object getWeatherReport(@PathVariable String country) {
        return weatherService.getData(country);
    }
}
