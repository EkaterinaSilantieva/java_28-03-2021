package HomeWorkApp6;

public abstract class Animal {
    private static int animalCount = 0;

    protected int runLength;
    protected int swimLength;

    public  Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}