package Lesson1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4, true, false, false);
    }

    public Cat(String name) {
        super(name, null, 4, true, false, false);
    }

    @Override
    public void toSpeak() {
        System.out.println("Мяу!");
    }
}