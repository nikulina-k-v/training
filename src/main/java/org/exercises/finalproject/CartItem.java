package org.exercises.finalproject;

import java.math.BigDecimal;
import java.util.Objects;

public class CartItem {
    private final Drink drink;
    private Short count;

    public CartItem(Drink drink, Short count) {
        this.drink = drink;
        this.count = setCount(count);
    }

    public Drink getDrink() {
        return drink;
    }

    public Short getCount() {
        return count;
    }

    public Short setCount(Short count) {
        if (count > 0) {
            return this.count = count;
        } else {
            throw new IllegalArgumentException("Количество товара не может быть меньше 1! Товар: " + this);
        }
    }

    public BigDecimal calculateTotalItemPrice() {
        return drink.getPrice().multiply(BigDecimal.valueOf(count));
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "drink=" + drink +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(drink, cartItem.drink)
                && Objects.equals(count, cartItem.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drink, count);
    }
}