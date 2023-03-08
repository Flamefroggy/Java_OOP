package veterinary;
import Lesson1.Ability.*;
import Lesson1.Parent.Animal;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private List<Animal> animals;

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
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
    public List<Runnable> getRunnable(){
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getAnimals()){
            if(animal instanceof Runnable){
                result.add((Runnable) animal);
            }
        }
        return result;
    }
}