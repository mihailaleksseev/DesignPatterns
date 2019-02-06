package Beverage;

/**
 * Класс напитка
 */

public abstract class Beverage {
    public String description = "Unknown Beverage.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
