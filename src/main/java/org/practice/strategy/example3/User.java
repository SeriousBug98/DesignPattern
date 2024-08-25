package org.practice.strategy.example3;

public class User {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("맥북",3000);
        Item item2 = new Item("그램", 1000);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.setPaymentStrategy(new KAKAOCardStrategy("s","s","s","s"));
        cart.performPay();
    }
}
