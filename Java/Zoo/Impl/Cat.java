package Zoo.Impl;

import Zoo.Parent.Animal;
import Zoo.Ability.Illable;
import Zoo.Ability.Runable;
import Zoo.Ability.Speakable;

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