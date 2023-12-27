package com.javaProjects.Weather.App.dto;

import com.javaProjects.Weather.App.service.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

/**
 * @author navjot.singh
 */

@Component
public class WeatherResponseTransformer implements DtoToEntityTransformer<Object, WeatherResponseDto> {

    private static final Logger LOGGER = LogManager.getLogger(WeatherResponseTransformer.class);
    private final ModelMapper mapper;
    @Autowired
    public WeatherResponseTransformer(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public WeatherResponseDto apply(Object object) {
        LOGGER.debug("Transforming AssetDTO to Asset...");
        return mapper.map(object , WeatherResponseDto.class);
    }

}
