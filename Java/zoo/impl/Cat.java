package zoo.impl;

import zoo.parent.Animal;
import zoo.ability.Illable;
import zoo.ability.Runable;
import zoo.ability.Speakable;

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
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public int getRunSpeed() {
        return 7;
    }

    @Override
    public void setIll() {
        this.setIll(true);
    }
}