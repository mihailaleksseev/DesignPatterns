package Wapon;

/**
 * Конкретная стратегия. Удар ножом.
 */
public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon(){
        System.out.println("Attack with Knife");
    }
}
