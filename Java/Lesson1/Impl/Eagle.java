package Lesson1.Impl;

import Lesson1.Ability.Flyable;
import Lesson1.Ability.Illable;
import Lesson1.Parent.Animal;


public class Eagle extends Animal implements Flyable, Illable {
    public Eagle(String name) {
        super(name);
    }
    public void getIll() {
        {
            System.out.println(this.getType() + " " + this.getName() + " заболел");
        }
    }

    @Override
    public void goToSleep() {

    }

    @Override
    public void toHunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 25;
    }
}
