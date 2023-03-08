package Lesson1.Impl;

import Lesson1.Parent.Animal;
import Lesson1.Ability.Illable;
import Lesson1.Ability.Speakable;
import Lesson1.Ability.Flyable;
import Lesson1.Ability.Swimable;
public class Duck extends Animal implements Flyable, Illable, Speakable, Swimable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void goToSleep() {
    }

    @Override
    public void toHunt() {

    }

    public void getIll() {
        {
            System.out.println(this.getType() + " " + this.getName() + " заболел");
        }
    }

    @Override
    public int getFlightSpeed() {
        return 15;
    }

    @Override
    public void speak() {
        System.out.println("Кря");
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }
}
