package model;

public abstract class Food {
    private int amount; // количество продукта в килограммах
    private double price; // цена за единицу
    protected boolean isVegetarian; // флаг вегетарианства

    protected Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
