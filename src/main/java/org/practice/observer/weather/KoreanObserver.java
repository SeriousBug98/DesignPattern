package org.practice.observer.weather;

import org.practice.observer.weather.Observer;

public class KoreanObserver implements Observer {
    private String name;
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherAPI weatherAPI;

    public KoreanObserver(String name, WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
        this.name = name;
        weatherAPI.registerObserver(this);
    }

    @Override
    public void display() {
        this.temp = weatherAPI.getTemp();
        this.humidity = weatherAPI.getHumidity();
        this.pressure = weatherAPI.getPressure();
        System.out.println("값이 갱신 되었습니다." + this.pressure);
    }
}
