package org.practice.strategy.example3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;
    List<Item> items;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void performPay() {
        int amount = 0;
        for (Item item : items) {
            amount += item.price;
        }
        paymentStrategy.pay(amount);
    }
}
