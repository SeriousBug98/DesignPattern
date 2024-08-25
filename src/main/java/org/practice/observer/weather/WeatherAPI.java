package org.practice.observer.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Subject{

    private List<Observer> observers;
    private float temp;
    private float pressure;
    private float humidity;

    public WeatherAPI() {
        this.observers = new ArrayList<Observer>();
    }

    void measurementsChanged() {
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.display();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
