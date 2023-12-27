package com.javaProjects.Weather.App.dto;

import lombok.Data;

@Data
public class Weather {
    private Integer id;
    private String main;
    private String description;
    private String icon;
}
