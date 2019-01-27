package Wapon;

/**
 * Конкретная стратегия. Удар топором.
 */
public class AxeBehavior implements WeaponBehavior {
    public void useWeapon(){
        System.out.println("Attack with Knife");
    }
}
