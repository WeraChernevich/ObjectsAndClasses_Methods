public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        Basket.addProductToBasket(50, 3);
        Basket.addProductToBasket(120, 5);
        double averagePrice = Basket.calcAveragePrice();
        System.out.println("Средняя цена товаров: " + averagePrice);
    }
}

