package Lesson1;

public class Fish extends Animal {

    public Fish (String name, String color) {
        super(name, color, 0, true, false, true);
    }
    public Fish (String color) {
            super(null, color, 0, true, false,true);
    }
    @Override
    public void toSpeak() {
        System.out.println("'блоб'");
    }
}
