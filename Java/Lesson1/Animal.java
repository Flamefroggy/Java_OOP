package Lesson1;

public class Animal {
    private String name;
    private  String color;
    private int pawsCount;
    private boolean isTail;
    private boolean canFly;
    private boolean canSwim;

    public Animal(String name, String color, int pawsCount, boolean isTail, boolean canFly, boolean canSwim) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        this.isTail = isTail;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }


    public String getType() {
        return this.getClass().getSimpleName();
    }
    public Animal(String name) {
        this(name, null, 0, true, false, true);
    }
    public Animal() {
        this(null, null, 0, true, false,true);
    }

    @Override
    public String toString() {
        return String.format("%s Имя: %s, Цвет: %s",getClass(),this.name, this.color );
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
    public boolean isTail() {
        return isTail;
    }
    public void setTail(boolean tail) {
        isTail = tail;
    }
    // Тут начинаем методы
    private void wakeUp() {
        System.out.println("Кошка проснулось");}
    private void findFood() {
        System.out.println("Кошка ищет еду");
    }
    private void toEat() {
        System.out.println("Кошка кушает");
    }
    public void toPlay() {
        System.out.println("Кошка играется");}
    public void goToSleep() {
        System.out.println("Кошка идёт спать");
    }
    public void toSleep() {
        System.out.println("Кошка спит");
    }
    public void  toSpeak() {
        System.out.println("Уруру");
    }
    public void toHunt(){
        wakeUp();
        findFood();
        toEat();
    }
    //ДЗ
    public void  toGo() {
        if (pawsCount >= 2) {
            System.out.println(getType() + " " + getName() + " идёт");
        }
        else toSwim();
    }
    public void  toFly() {
        if (canFly) {
            System.out.println(getType() + " " + getName() + " летит");
        }
        else toGo();
    }
    public void  toSwim() {
        if (canSwim) {
            System.out.println(getType() + " " + getName() + " плывёт");
        }
        else toGo();
    }
}
