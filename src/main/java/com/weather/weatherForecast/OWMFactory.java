package com.weather.weatherForecast;
import com.weather.config.weatherApiConfig;
import net.aksingh.owmjapis.core.OWM;

/**
 * OWMFactory class implementation which implements IOWMFactory
 * @version 1.1
 * @see IOWMFactory
 */

public class OWMFactory implements IOWMFactory {

    /**
     * Implements interface methods create which is without parameters
     * @return OWM Object with default ApiKey for this application
     */
    @Override
    public OWM create() {
        return new OWM(weatherApiConfig.getApiKey());
    }

    /**
     * Implements interface methods create with selected apiKey
     *
     * @param apiKey String object which includes ApiKey - key for your application from OpenWeatherMap.org
     * @return OWM Object with default ApiKey for this application
     */
    @Override
    public OWM create(String apiKey) {
        return new OWM(apiKey);
    }
}
