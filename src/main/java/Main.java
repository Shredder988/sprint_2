import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import model.constants.Colour;
import model.constants.Discount;


public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100); // 5 кг мяса по 100 рублей
        Apple redApple = new Apple(10, 50, "red"); // 10 кг красных яблок по 50 рублей
        Apple greenApple = new Apple(8, 60, "green"); // 8 кг зелёных яблок по 60 рублей


        Food[] products = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(products);


        System.out.printf("Общая сумма товаров без скидки: %.2f руб.\n", cart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f руб.\n", cart.getTotalWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f руб.\n", cart.getTotalVegetarianWithoutDiscount());
    }
}