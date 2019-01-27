package Сharacters;

import Wapon.SwordBehavior;

/**
 * Реализация класса конкретного персонажа.
 * В конструкторе задается тип оружия по умолчанию.
 */

public class King extends Character{
    public King(){
        weapon = new SwordBehavior();
    }

    public void display() {
        System.out.println("I`m a king");
    }

}
