public class Main {
    public static void main(String[] args) {
        model.Food meat = new model.Meat(5, 100);
        model.Food redApple = new model.Apple(10, 50, model.constants.Colour.RED);
        model.Food greenApple = new model.Apple(8, 60, model.constants.Colour.GREEN);

        model.Food[] products = {meat, redApple, greenApple};

        service.ShoppingCart cart = new service.ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.2f руб.\n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f руб.\n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f руб.\n", cart.getTotalVegetarianPrice());
    }
}