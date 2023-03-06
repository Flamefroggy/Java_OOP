package Lesson1;

public class Whale extends Animal {

    public Whale (String name, String color) {
        super(name, color, 0, false, false,true);
    }
    @Override
    public void toSpeak() {
        System.out.println("'Звуки кита'");
    }

}
