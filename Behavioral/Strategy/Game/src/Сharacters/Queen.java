package Сharacters;

import Wapon.KnifeBehavior;

/**
 * Реализация класса конкретного персонажа.
 * В конструкторе задается тип оружия по умолчанию.
 */

public class Queen extends Character{
    public Queen(){
        weapon = new KnifeBehavior();
    }

    public void display() {
        System.out.println("I`m a queen");
    }
}
