package com.weather.utils;
import net.aksingh.owmjapis.core.OWM;


public interface IOWMFactory{
    OWM create();
    OWM create(String apiKey);
}
