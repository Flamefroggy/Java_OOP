package Lesson1;

public class Cheetah extends Animal {

    public Cheetah (String color) {
        super(null, color, 4, true,false,false);
    }
    @Override
    public void toSpeak() {
        System.out.println("Роар!");
    }
}
