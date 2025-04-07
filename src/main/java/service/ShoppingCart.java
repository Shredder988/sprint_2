package service;

import model.Food;

public class ShoppingCart {

    private Food[] arrayFood;

    public ShoppingCart(Food[] arrayFood){
        this.arrayFood = arrayFood;
    }

    private double сounterPriceNotDiscount;
    public double amountNotDiscount(){
        for(int i = 0; i < arrayFood.length; i++){
            сounterPriceNotDiscount = сounterPriceNotDiscount + arrayFood[i].getPrice();
        }
        return сounterPriceNotDiscount;
    }

    private double сounterPriceWithDiscount;
    public double amountAllPriceWithDiscount(){
        for(int i = 0; i < arrayFood.length; i++){
            double price = arrayFood[i].getPrice();
            double discountable = arrayFood[i].getDiscount();
            if (discountable == 0){
                сounterPriceWithDiscount = сounterPriceWithDiscount + price;
            } else{
                сounterPriceWithDiscount = сounterPriceWithDiscount + price - ((price/100)*discountable);
            }
        }
        return сounterPriceWithDiscount;
    }

    private double counterAllVegetarianProduct;
    public double amountAllVegetarianProduct() {
        for (int i = 0; i < arrayFood.length; i++) {
            if (arrayFood[i].isVegetarian() == true) {
                counterAllVegetarianProduct = counterAllVegetarianProduct + arrayFood[i].getPrice();
            }
        }
        return counterAllVegetarianProduct;
    }

}