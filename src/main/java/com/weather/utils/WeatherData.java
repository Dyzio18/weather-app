package com.weather.utils;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.model.DailyWeatherForecast;

public class WeatherData {
    static OWMFactory owmFactory = new OWMFactory();

    public static CurrentWeather weatherForCityWithName(String cityName) throws APIException
    {
        return owmFactory.create().currentWeatherByCityName(cityName);
    }

    public static CurrentWeather weatherForCityWithNameAndCountryCode(String cityName, OWM.Country countryCode)
            throws APIException
    {
        return owmFactory.create().currentWeatherByCityName(cityName, countryCode);
    }

    public static DailyWeatherForecast fiveDaysForecastForCityWithName(String cityName, int numberOfDays)
            throws APIException
    {
        return owmFactory.create().dailyWeatherForecastByCityName(cityName, numberOfDays);
    }

    public static DailyWeatherForecast fiveDaysForecastForCityWithNameAndCountryCode(String cityName, int numberOfDays, OWM.Country countryCode)
            throws APIException
    {
        return owmFactory.create().dailyWeatherForecastByCityName(cityName,countryCode, numberOfDays);
    }
}


