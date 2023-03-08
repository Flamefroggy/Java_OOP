package Lesson1.Parent;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String name;
    private  String color;
    private int pawsCount;
    private boolean isIll;


    public Animal(String name, String color, int pawsCount, boolean isIll) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        this.isIll = isIll;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
    public Animal(String name) {
        this(name, null, 0, false);
    }
    public Animal() {
        this(null, null, 0, false);
    }

    @Override
    public String toString() {
        return String.format("\n"+"%s, Имя: %s",getType(),this.name );
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPawsCount() {
        return pawsCount;
    }
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    // Тут начинаем методы
    protected void wakeUp() {
        System.out.println("просыпается");}
    private void findFood() {
        System.out.println("ищет еду");
    }
    private void toEat() {
        System.out.println("кушает");
    }
    public void toPlay() {
        System.out.println("играется");}
    public abstract void goToSleep();
    public void toSleep() {
        System.out.println("спит");
    }
    public abstract void toHunt();

}
