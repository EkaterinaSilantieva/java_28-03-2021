package HomeWorkApp7;

public class Cat {
    private String name;
    private boolean hungry;
    private int appetite;

    public Cat(String name) {
        appetite = (int) (1 + Math.random() * 50);
        hungry = true;
        this.name = name;
    }

    public void eat(Plate plate) {

        if (hungry) {
            if (plate.getFood() >= appetite) {
                hungry = false;
                plate.consumeFood(appetite);
                System.out.println("Котик" + name + " съел " + appetite + " " + "еды.");
            } else {
                System.out.println("Котик" + name + " не наелся. Нужно добавить еды.");
            }
        } else {
            System.out.println("Котик" + name + " сыт.");
        }
    }
}
