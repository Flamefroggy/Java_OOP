package Lesson1;

public class Wolf extends Animal {

    public Wolf(String name, String color) {
        super(name, color, 4, true,false, true);
    }
    @Override
    public void toSpeak() {
        System.out.println("Ауууу, роар!");
    }
}
