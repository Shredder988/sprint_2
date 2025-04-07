package model;

public abstract class Food implements IDiscountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount=amount;
        this.price=price;
        this.isVegetarian=isVegetarian;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount=amount;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

    public void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian=isVegetarian;
    }

}