package zoo.impl;

import zoo.parent.Animal;
import zoo.ability.*;
public class Duck extends Animal implements Flyable, Illable, Speakable, Swimable, Runable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void goToSleep() {
    }

    @Override
    public void toHunt() {

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

    @Override
    public int getRunSpeed() {
        return 2;
    }
    @Override
    public void setIll() {
        this.setIll(true);
    }
}
