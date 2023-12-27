package com.javaProjects.Weather.App.dto;

import java.util.function.Function;

public interface DtoToEntityTransformer<T, R> extends Function<T, R> {

}