package zoo.impl;

import zoo.ability.Flyable;
import zoo.ability.Illable;
import zoo.ability.Speakable;
import zoo.parent.Animal;


public class Eagle extends Animal implements Flyable, Illable, Speakable {
    public Eagle(String name) {
        super(name);
    }


    @Override
    public void setIll() {
        this.setIll(true);
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

    @Override
    public void speak() {
        System.out.println("'хищные звуки орла'");
    }
}
