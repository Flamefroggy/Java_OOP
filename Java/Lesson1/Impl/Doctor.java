package Lesson1.Impl;

import Lesson1.Parent.Human;

public class Doctor extends Human {

    public Doctor(String name, String citizenship, String gender, int age, String profession, boolean isIll) {
        super(name, citizenship, gender, age, profession, isIll);
    }

    public Doctor(String name, int age) {
        super(name, age);
        setProfession("Доктор");
    }
    public Doctor() {
        super();
        setProfession("Доктор");
    }

    public void toHeal() {
        work();
    }

    @Override
    public void work() {
        System.out.println("Лечит");
    }


    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public void speak() {
        System.out.println("Подходи, вылечу");
    }
}
