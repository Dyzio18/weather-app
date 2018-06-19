package com.weather;

import com.weather.utils.WeatherData;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) throws APIException {
        SpringApplication.run(SpringBootWebApplication.class, args);

        CurrentWeather currentWeather =  WeatherData.weatherForCityWithName("Krakow");
        System.out.println(currentWeather.getMainData().getTemp() - 273.15);
    }

}
