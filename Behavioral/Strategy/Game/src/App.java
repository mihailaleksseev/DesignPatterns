import Wapon.AxeBehavior;
import Wapon.SwordBehavior;
import Сharacters.Character;
import Сharacters.Queen;
import Сharacters.Troll;

/**
 * Класс персонажа не знает о том каким способом (стратегией)
 * воспользуется клиент, а просто вызывает метод сражения,
 * остальное стратегия выполняет сама.
 */

public class App {

    public static void main(String[] args) {
        Character troll = new Troll();
        troll.display();
        troll.setWeapon(new AxeBehavior());
        troll.fight();

        Character queen = new Queen();
        queen.display();
        queen.fight();

        troll.display();
        troll.setWeapon(new SwordBehavior());
        troll.fight();
    }
}
