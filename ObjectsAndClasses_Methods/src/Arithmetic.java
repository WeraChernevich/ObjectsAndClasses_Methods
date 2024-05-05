public class Arithmetic {

    private int numberFirst;
    private int numberSecond;


    public static void main(String[] args) {
        Arithmetic add = new Arithmetic(500, 120);
        System.out.println("Результат сложения: " + add.sum());
        System.out.println("Результат умножения: " + add.product());
        System.out.println("Максимальное значение: " + add.maxNumber());
        System.out.println("Минимальное значение: " + add.minNumber());

    }
    public Arithmetic(int a, int b) {
        this.numberFirst = a;
        this.numberSecond = b;
    }

    public int sum() {
        return numberFirst + numberSecond;
    }

    public int product() {
        return numberFirst * numberSecond;
    }

    public int minNumber() {
        if (numberFirst > numberSecond) {
            return numberSecond;
        } else if (numberFirst == numberSecond) {
            System.out.println("Значения равны");
        }
        return numberFirst;
    }

    public int maxNumber() {
        if (numberFirst < numberSecond) {
            return numberSecond;
        } else if (numberFirst == numberSecond) {
            System.out.println("Значения равны");
        }
        return numberFirst;
    }
}
