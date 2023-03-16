package zoo.impl;

import zoo.parent.Human;

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

    public void toTreat() {
        System.out.println("Вылечил" );
    }

    @Override
    public void work() {
        toTreat();
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

    @Override
    public void setIll() {
        this.setIll(true);
    }
}
