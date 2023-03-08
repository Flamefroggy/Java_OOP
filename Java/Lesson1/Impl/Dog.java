package Lesson1.Impl;

import Lesson1.Parent.Animal;
import Lesson1.Ability.Illable;
import Lesson1.Ability.Runable;
import Lesson1.Ability.Speakable;
import Lesson1.Ability.Swimable;

public class Dog extends Animal implements Illable, Runable, Swimable, Speakable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void goToSleep() {
    }

    @Override
    public void toHunt() {}
    @Override
    public void getIll() {
        {
            System.out.println(this.getType() + " " + this.getName() + " заболел");
        }
    }
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public int getSwimSpeed() {
        return 4;
    }


    @Override
    public int getRunSpeed() {
        return 7;
    }
}
