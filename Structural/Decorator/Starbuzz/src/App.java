import Beverage.Beverage;
import ConcreteBeverage.DarkRoast;
import ConcreteBeverage.Espresso;
import ConcreteBeverage.HouseBlend;
import ConcreteDecorator.Mocha;
import ConcreteDecorator.Soy;
import ConcreteDecorator.Whip;

/**
 * Конкретный кофе мы заворачиваем в декоратор, таким образом меняется
 * описание и суммирвется стоимость с добавлением каждого дополнительного ингредиента
 */

public class App {

    public static void main(String args[]) {
        Beverage miamiBeverage = new Espresso();
        System.out.println(miamiBeverage.getDescription()
                + " $" + miamiBeverage.cost());

        Beverage milkBeverage = new DarkRoast();
        milkBeverage = new Mocha(milkBeverage);
        milkBeverage = new Mocha(milkBeverage);
        milkBeverage = new Whip(milkBeverage);
        System.out.println(milkBeverage.getDescription()
                + " $" + milkBeverage.cost());

        Beverage specialBeverage = new HouseBlend();
        specialBeverage = new Soy(specialBeverage);
        specialBeverage = new Mocha(specialBeverage);
        specialBeverage = new Whip(specialBeverage);
        System.out.println(specialBeverage.getDescription()
                + " $" + specialBeverage.cost());
    }
}
