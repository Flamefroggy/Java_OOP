package Zoo.Impl;

import Zoo.Ability.Flyable;
import Zoo.Ability.Illable;
import Zoo.Parent.Animal;


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
