import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    private static final String RED = "red";
    private static final String GREEN = "green";

    public static void main(String[] args){
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] food = new Food[]{meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.printf("Общая сумму товаров без скидки " + shoppingCart.amountNotDiscount());
        System.out.printf("Общая сумма товаров со скидкой " + shoppingCart.amountAllPriceWithDiscount());
        System.out.printf("Сумму всех вегетарианских продуктов без скидки " + shoppingCart.amountAllVegetarianProduct());
    }

}