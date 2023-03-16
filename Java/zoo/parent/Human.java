package zoo.parent;

import zoo.ability.Illable;
import zoo.ability.Runable;
import zoo.ability.Speakable;
import zoo.ability.Swimable;

public abstract class Human implements Illable, Runable, Swimable, Speakable {
    private String name;
    private String citizenship;
    private String gender;
    private int age;
    private String profession;
    private boolean isIll;

    public Human(String name, String citizenship, String gender, int age, String profession, boolean isIll) {
        this.name = name;
        this.citizenship = citizenship;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
        this.isIll = isIll;
    }
    public Human() {
        this("Александр", "Россиянин", "Мужской", 35, "Студент", false);
    }
    public Human(String name, int age) {
        this(name, "Россиянин", "Мужской", age, "Студент",false);
    }

    @Override
    public String toString() {
        return String.format("%s Имя: %s, Профессия: %s",getClass(),this.name, this.profession, this.isIll );
    }
//  Геттеры и Сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    private void washHands () {
        System.out.println("Помыл руки");
    }
    private void putFoodOnAPlate() {
        System.out.println("Наложил еды");
    }
    private  void startEating() {
        System.out.println("Кушает");
    }
    public void eating() {
        washHands();
        putFoodOnAPlate();
        startEating();
    }
    public abstract void work();

}