package Lesson1;

public class Duck extends Animal {
    public Duck (String name, String color) {
        super(name, color, 2, true,true,true);
    }
    public Duck (String name) {
        super(name);
    }
    @Override
    public void  toSpeak() {
        System.out.println("Кря!");
    }
}
