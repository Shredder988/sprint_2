package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour; // цвет яблок

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true; // Яблоки являются вегетарианскими продуктами
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}
