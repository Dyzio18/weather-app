package com.weather.services;

import com.weather.models.City;

public interface CityService {

    Iterable<City> listAllCities();

    City getCityById(Integer id);

    City saveCity(City city);

    void deleteCity(Integer id);

}
