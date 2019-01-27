import Duck.Duck;
import Duck.MallardDuck;
import Duck.ToyDuck;
import Duck.RobotDuck;
import Fly.FlyRocketPower;

public class App {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck toy = new ToyDuck();
        toy.performQuack();
        toy.performFly();

        Duck robot = new RobotDuck();
        robot.performFly();
        robot.setFlyBehavior(new FlyRocketPower());
        robot.performFly();
    }
}
