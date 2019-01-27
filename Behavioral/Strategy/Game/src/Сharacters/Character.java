package Сharacters;

import Wapon.WeaponBehavior;


/**
 * Класс персонажа, в конструкторах дочерних классов объявляется свойство weapon,
 * которое отвечает за текущее оружие персонажа. Методы fight и setWeapon
 * не переопределяются в дочерних классах.
 */

public abstract class Character {

    WeaponBehavior weapon;

    public void Character() {
    }

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
