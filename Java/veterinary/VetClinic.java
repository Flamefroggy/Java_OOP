package veterinary;
import zoo.ability.*;
import zoo.parent.Animal;
import zoo.parent.Human;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    private final List<Human> staff;


    public VetClinic() {
        this.animals = new ArrayList<>();
        this.staff = new ArrayList<>();
    }
    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }
    public VetClinic addStaff(Human staff) {
        this.staff.add(staff);
        return this;
    }
    //Показать всех животных
    public List<Animal> getAnimals() {
        return animals;
    }
    //Говорящие
    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : getAnimals()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }
    //Плавающие
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
    //Летающие
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    //Бегающие
    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Runable){
                result.add((Runable) animal);
            }
        }
        return result;
    }
}