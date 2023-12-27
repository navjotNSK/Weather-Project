package com.javaProjects.Weather.App.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class WeatherResponseDto  {
private Map<String,Integer> coord;
private List<Weather> weather;
private String  base;
private  Map<String,Integer> main;
private Integer visibility;
private Map<String,Integer> wind;
private Map<String,Integer> clouds;
private Integer dt;
private Map<String,String> sys;
private Integer timezone;
private Integer id;
private String  name;
private Integer cod;


}
