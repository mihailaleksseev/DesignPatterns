package com.company.Observers;

/**
 * Интерфейс Observer реализуется всеми наблюдателями
 */

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
