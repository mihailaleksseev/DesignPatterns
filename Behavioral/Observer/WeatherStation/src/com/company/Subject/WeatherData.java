package com.company.Subject;

import com.company.Observers.Observer;
import java.util.ArrayList;

/**
 * Погодная станция оповещает наблюдателей при изменении температуры,
 * она же субъект
 */
public class WeatherData implements Subject {
    /**
     * Контейнер ArrayList observers хранит всех наблюдателей
     */
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Реализация интерфейса Subject, реализация методов registerObserver, removeObserver и notifyObserver
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    /**
     * Оповещение наблюдателей происходит посредством метода update
     */
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
       this.temperature = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
       measurementChanged();
    }
}
