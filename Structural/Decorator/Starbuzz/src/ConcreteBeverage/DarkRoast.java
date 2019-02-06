package ConcreteBeverage;
import Beverage.Beverage;

/**
 * Все классы конеретных напитков расширяют Beverage
 * Описание задается в конструкторе класса
 * Стоиомость в данный момент задается фиксированно
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Espresso";
    }

    public double cost() {
        return .99;
    }
}