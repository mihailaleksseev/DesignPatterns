package ConcreteDecorator;

import Beverage.Beverage;
import Beverage.CondimentDecorator;

/**
 * Конкретный декоратор кофе с соевым молоком
 * Стоимость считается путем прибаления суммирования стоимости напитка и декоратора
 * В объекте декоратора хранится ссылка на конеретный напиток
 */

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
