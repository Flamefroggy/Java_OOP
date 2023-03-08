package Zoo;

import Zoo.Impl.*;
import veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Барсик"))
                .addAnimal(new Cat("Муся"))
                .addAnimal(new Cat("Локи"))
                .addAnimal(new Cat("Лютик"))
                .addAnimal(new Cat("Клякса"))
                .addAnimal(new Dog("Герда"))
                .addAnimal(new Dog("Кнопа"))
                .addAnimal(new Dog("Гавр"))
                .addAnimal(new Duck("Наташа"));


/**
        List<Illable> illableList = new ArrayList<>();
        illableList.add(new Cat("Буся"));
        illableList.add(new Dog("Гавр"));


        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(new Eagle("Игорь"));
        flyableList.add(new Duck("Наташа"));

        List<Runable> runableList = new ArrayList<>();
        runableList.add(new Cat("Муся"));
        runableList.add(new Dog("Герда"));

        List<Swimable> swimableList = new ArrayList<>();
        swimableList.add(new Duck("Наташа"));
        swimableList.add(new Dog("Герда")); **/

//Показать всех животных, записанных в клинику
        System.out.println(vetClinic.getAnimals());
//Показать говорящих итд
        System.out.println("Говорящие: " + vetClinic.getSpeakable());
        System.out.println("Плавающие: " + vetClinic.getSwimable());
        System.out.println("Летающие: "  + vetClinic.getFlyable());
        System.out.println("Бегающие: "  + vetClinic.getRunnable());
    }
}