package org.practice.observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherAPI weatherAPI = new WeatherAPI();
        Observer observer = new KoreanObserver("korean",weatherAPI);

        weatherAPI.measurementsChanged();
    }
}
