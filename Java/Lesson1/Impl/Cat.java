package Lesson1.Impl;

import Lesson1.Parent.Animal;
import Lesson1.Ability.Illable;
import Lesson1.Ability.Runable;
import Lesson1.Ability.Speakable;

public class Cat extends Animal implements Illable, Runable, Speakable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void goToSleep() {
    }

    @Override
    public void toHunt() {
    }
    @Override
    public void getIll() {
        {
            System.out.println(this.getType() + " " + this.getName() + " заболел");
        }
    }
    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public int getRunSpeed() {
        return 7;
    }
}