package Zoo.Impl;

import Zoo.Parent.Animal;
import Zoo.Ability.Illable;
import Zoo.Ability.Runable;
import Zoo.Ability.Speakable;
import Zoo.Ability.Swimable;

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
