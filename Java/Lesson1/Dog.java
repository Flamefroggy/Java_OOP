package Lesson1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color, 4, true,false,true);
    }
    public Dog (String name) {
        super(name);
    }
    @Override
    public void  toSpeak() {
        System.out.println("Гав!");
    }
}
