package com.weather.utils;

import com.weather.config.weatherApiConfig;
import net.aksingh.owmjapis.core.OWM;

public class OWMFactory implements IOWMFactory {
    @Override
    public OWM create() {
        return new OWM(weatherApiConfig.getApiKey());
    }

    @Override
    public OWM create(String apiKey) {
        return new OWM(apiKey);
    }
}
