package Lesson1;

public class Sparrow extends Animal {

    public Sparrow(String name) {
        super(name, "brown", 2, true, true,false);
    }
    @Override
    public void toSpeak() {
        System.out.println("Чик-чирик, Я КАПИТАН Джек Воробей!");
    }
    @Override
    public void toGo() {
        System.out.println("Подпрыгиваю к цели!");
    }

}
