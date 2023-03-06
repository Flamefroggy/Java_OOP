package Lesson1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 0, true,false,false);
//        System.out.println(animal.getColor());

        Animal animal1 = new Animal("Идиот");
//        System.out.println(animal.getPawsCount());
        Object animal3 = new Animal();
//        System.out.println(animal1.getType());

//        Cat cat1 = new Cat("����");
//        System.out.println(cat1.getName());
//        System.out.println(cat1.getType());

        Animal cat2 = new Cat("Муся");
//        cat2.toSpeak();
//        animal1.toSpeak();
        Animal falcon = new Falcon("light blue");
        Animal goldFish = new Fish("Чарли", "золотая");
        Animal cheetah = new Cheetah("пятнистый");
        Animal sparrow = new Sparrow("Джек");
        Animal whale = new Whale(null, "blue");
        Animal wolf = new Wolf("из 'Ну, погоди'", "серый");

/**        List<Animal> animals = new ArrayList<>();
        animals.add(cat2);
        animals.add(new Dog("Филя"));
        animals.add(new Duck("Гаврик"));
**/

//        cat2.toHunt();
        cat2.toFly();
//        System.out.println(cat2.getPawsCount());
        falcon.toSwim();
        falcon.toFly();
        falcon.toSpeak();
        goldFish.toFly();
        goldFish.toSwim();
        goldFish.toSpeak();
        cheetah.toGo();
        cheetah.toFly();
        cheetah.toSpeak();
        sparrow.toFly();
        sparrow.toSwim();
        sparrow.toSpeak();
        whale.toSwim();
        whale.toFly();
        whale.toSpeak();
        wolf.toSwim();
        wolf.toGo();
        wolf.toSpeak();
    }
}