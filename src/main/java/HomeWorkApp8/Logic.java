package HomeWorkApp8;

public class Logic {
    public int side = 3;
    public int length = side*side;
    public String[] array = new String[length];
    Result result = new Result(side,side,3);

    public void startPosition() {
        array = new String[length];
        int index = (int) (Math.random()*length);
    }

    public String result() {
        return result.process(array);
    }

    public boolean write(int index, String symbol) {
        if (array[index]==null) {
            array[index] = symbol;
        } else {
            return false;
        }
        return true;
    }

    public boolean positionUser(int index) {

        return write(index,"X");
    }

    public boolean positionPC() {
        int index = (int) (Math.random()*9);
        write(index,"O");
        return false;
    }
}
