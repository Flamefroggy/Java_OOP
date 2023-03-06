package Lesson1;

public class Falcon extends Animal {

    public Falcon(String color) {
        super(null, color, 2, true, true, false);
    }
    @Override
    public void  toSpeak() {
        System.out.println("'Звуки сокола'");
    }
}
