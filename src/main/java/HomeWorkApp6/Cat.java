package HomeWorkApp6;

public class Cat extends Animal {

    private static int catCount = 0;

    public Cat() {
        catCount++;
        runLength = (int) (5 + Math.random() * 50);
        swimLength = 0;
    }

        @Override
        public void run(int distance){
            if (distance <= runLength) {
                System.out.println("Кот пробежал " + distance + " м.");
            } else {
                System.out.println("Кот не бежит");
            }
        }

        @Override
        public void swim(int distance){
            System.out.println("Кот не умеет плавать");
        }

    public static int getCatCount() {
        return catCount;
    }
}

