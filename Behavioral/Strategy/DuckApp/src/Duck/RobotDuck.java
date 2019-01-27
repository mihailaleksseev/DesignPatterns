package Duck;

import Fly.FlyNoWay;
import Quack.Quack;

public class RobotDuck extends Duck {
    public RobotDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I`m a robot duck");
    }
}
