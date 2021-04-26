package HomeWorkApp7;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(" Кысь");
        cats[1] = new Cat(" Брысь");
        cats[2] = new Cat(" Мяу");

        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        plate.addFood(50);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            cat.eat(plate);
        }

    }
}
