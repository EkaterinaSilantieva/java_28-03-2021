package HomeWorkApp6;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog() {
        dogCount++;
        runLength = (int) (10 + Math.random() * 100);
        swimLength = (int) (3 + Math.random() * 20);
    }

    @Override
    public void run(int distance) {
        if (distance <= runLength) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не бежит");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= runLength) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не плывет");
        }
            }

    public static int getDogCount() {
        return dogCount;
    }
}

