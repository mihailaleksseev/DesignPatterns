package ConcreteDecorator;

import Beverage.Beverage;
import Beverage.CondimentDecorator;

/**
 * Конкретный декоратор кофе со сливками
 * Стоимость считается путем прибаления суммирования стоимости напитка и декоратора
 * В объекте декоратора хранится ссылка на конеретный напиток
 */

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
