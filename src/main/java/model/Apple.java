package model;

public class Apple extends Food {
    private String colour; // цвет яблок

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true; // Яблоки являются вегетарианскими продуктами
    }
}