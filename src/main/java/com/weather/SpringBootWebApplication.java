package com.weather;

import com.weather.utils.WeatherData;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.model.DailyWeatherForecast;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) throws APIException {
        SpringApplication.run(SpringBootWebApplication.class, args);

        DailyWeatherForecast currentWeather =  WeatherData.fiveDaysForecastForCityWithName("Krakow",1);

        System.out.println(currentWeather.component5().toString());
    }

}
