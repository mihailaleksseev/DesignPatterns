package ConcreteBeverage;
import Beverage.Beverage;

/**
 * Все классы конеретных напитков расширяют Beverage
 * Описание задается в конструкторе класса
 * Стоиомость в данный момент задается фиксированно
 */

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
