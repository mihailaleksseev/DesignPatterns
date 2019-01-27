package Сharacters;

import Wapon.AxeBehavior;

/**
 * Реализация класса конкретного персонажа.
 * В конструкторе задается тип оружия по умолчанию.
 */

public class Troll extends Character{
    public Troll(){
        weapon = new AxeBehavior();
    }

    public void display() {
        System.out.println("I`m a troll");
    }

}

