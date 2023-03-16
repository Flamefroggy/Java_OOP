package zoo.impl;

import zoo.parent.Animal;
import zoo.ability.Illable;
import zoo.ability.Runable;
import zoo.ability.Speakable;
import zoo.ability.Swimable;

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
    @Override
    public void setIll() {
        this.setIll(true);
    }
}
