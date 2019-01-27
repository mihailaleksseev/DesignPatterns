package Duck;

import Fly.FlyNoWay;
import Quack.MuteQuack;

public class ToyDuck extends Duck {
    public ToyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I`m mallard duck");
    }
}
