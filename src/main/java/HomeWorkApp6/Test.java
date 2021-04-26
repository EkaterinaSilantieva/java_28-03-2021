package HomeWorkApp6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(Animal.getAnimalCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());

        cat.run(20);
        cat.swim(200);
        dog.run(50);
        dog.swim(8);
    }
}


