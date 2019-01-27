package Wapon;

/**
 * Конкретная стратегия. Удар Мечом.
 */
public class SwordBehavior implements WeaponBehavior {
    public void useWeapon(){
        System.out.println("Attack with Sword");
    }
}
